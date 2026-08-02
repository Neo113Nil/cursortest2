package ru.CryptoPro.reprov.certpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class AdjacencyList {
    public final ArrayList a = new ArrayList();
    public final ArrayList b;

    public AdjacencyList(ArrayList arrayList) {
        this.b = arrayList;
        a(arrayList, 0, null);
    }

    public final boolean a(ArrayList arrayList, int i, BuildStep buildStep) {
        ArrayList arrayList2;
        BuildStep buildStep2;
        List<Vertex> list = (List) arrayList.get(i);
        try {
            Iterator it = list.iterator();
            boolean z = true;
            boolean z2 = true;
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList2 = this.a;
                if (!hasNext) {
                    break;
                }
                Vertex vertex = (Vertex) it.next();
                if (vertex.getIndex() != -1) {
                    if (((List) arrayList.get(vertex.getIndex())).size() != 0) {
                        z = false;
                    }
                } else if (vertex.getThrowable() == null) {
                    z2 = false;
                }
                arrayList2.add(new BuildStep(vertex, 1));
            }
            if (!z) {
                boolean z3 = false;
                for (Vertex vertex2 : list) {
                    if (vertex2.getIndex() != -1 && ((List) arrayList.get(vertex2.getIndex())).size() != 0) {
                        BuildStep buildStep3 = new BuildStep(vertex2, 3);
                        arrayList2.add(buildStep3);
                        z3 = a(arrayList, vertex2.getIndex(), buildStep3);
                    }
                }
                if (z3) {
                    return true;
                }
                buildStep2 = buildStep == null ? new BuildStep(null, 4) : new BuildStep(buildStep.getVertex(), 2);
            } else {
                if (!z2) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Vertex vertex3 : list) {
                        if (vertex3.getThrowable() == null) {
                            arrayList3.add(vertex3);
                        }
                    }
                    arrayList2.add(arrayList3.size() == 1 ? new BuildStep((Vertex) arrayList3.get(0), 5) : new BuildStep((Vertex) arrayList3.get(0), 5));
                    return true;
                }
                buildStep2 = buildStep == null ? new BuildStep(null, 4) : new BuildStep(buildStep.getVertex(), 2);
            }
            arrayList2.add(buildStep2);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public Iterator iterator() {
        return Collections.unmodifiableList(this.a).iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[\n");
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            List list = (List) it.next();
            sb.append("LinkedList[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]:\n");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(((Vertex) it2.next()).toString());
                sb.append("\n");
            }
            i = i2;
        }
        sb.append("]\n");
        return sb.toString();
    }
}
