package androidx.constraintlayout.core.parser;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class CLContainer extends CLElement {
    public ArrayList mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList();
    }

    public final void add(CLElement cLElement) {
        this.mElements.add(cLElement);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone */
    public CLContainer mo1081clone() {
        CLContainer cLContainer = (CLContainer) super.mo1081clone();
        ArrayList arrayList = new ArrayList(this.mElements.size());
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement mo1081clone = ((CLElement) it.next()).mo1081clone();
            mo1081clone.mContainer = cLContainer;
            arrayList.add(mo1081clone);
        }
        cLContainer.mElements = arrayList;
        return cLContainer;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.mElements.equals(((CLContainer) obj).mElements);
        }
        return false;
    }

    public final CLElement get(String str) {
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.content().equals(str)) {
                if (cLKey.mElements.size() > 0) {
                    return (CLElement) cLKey.mElements.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("no element for key <", str, ">"), this);
    }

    public final float getFloat(String str) {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("no float found for key <", str, ">, found [");
        m3m.append(cLElement.getStrClass());
        m3m.append("] : ");
        m3m.append(cLElement);
        throw new CLParsingException(m3m.toString(), this);
    }

    public final int getInt(int i) {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getInt$1();
        }
        throw new CLParsingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "no int at index "), this);
    }

    public final CLElement getOrNull(String str) {
        Iterator it = this.mElements.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.content().equals(str)) {
                if (cLKey.mElements.size() > 0) {
                    return (CLElement) cLKey.mElements.get(0);
                }
            }
        }
        return null;
    }

    public final String getString(String str) {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("no string found for key <", str, ">, found [", cLElement != null ? cLElement.getStrClass() : null, "] : ");
        m.append(cLElement);
        throw new CLParsingException(m.toString(), this);
    }

    public final String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public final boolean has(String str) {
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.mElements, Integer.valueOf(super.hashCode()));
    }

    public final ArrayList names() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).content());
            }
        }
        return arrayList;
    }

    public final void put(String str, CLElement cLElement) {
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.content().equals(str)) {
                int size = cLKey.mElements.size();
                ArrayList arrayList = cLKey.mElements;
                if (size > 0) {
                    arrayList.set(0, cLElement);
                    return;
                } else {
                    arrayList.add(cLElement);
                    return;
                }
            }
        }
        CLKey cLKey2 = new CLKey(str.toCharArray());
        cLKey2.mStart = 0L;
        long length = str.length() - 1;
        if (cLKey2.mEnd == Long.MAX_VALUE) {
            cLKey2.mEnd = length;
            CLContainer cLContainer = cLKey2.mContainer;
            if (cLContainer != null) {
                cLContainer.add(cLKey2);
            }
        }
        int size2 = cLKey2.mElements.size();
        ArrayList arrayList2 = cLKey2.mElements;
        if (size2 > 0) {
            arrayList2.set(0, cLElement);
        } else {
            arrayList2.add(cLElement);
        }
        this.mElements.add(cLKey2);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final float getFloat(int i) {
        CLElement cLElement = get(i);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "no float at index "), this);
    }

    public final String getString(int i) {
        CLElement cLElement = get(i);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "no string at index "), this);
    }

    public final CLElement getOrNull(int i) {
        if (i < 0 || i >= this.mElements.size()) {
            return null;
        }
        return (CLElement) this.mElements.get(i);
    }

    public final CLElement get(int i) {
        if (i >= 0 && i < this.mElements.size()) {
            return (CLElement) this.mElements.get(i);
        }
        throw new CLParsingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "no element at index "), this);
    }
}
