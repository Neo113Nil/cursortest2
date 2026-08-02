package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class GeneralSubtrees implements Cloneable {
    private static final int NAME_DIFF_TYPE = -1;
    private static final int NAME_MATCH = 0;
    private static final int NAME_NARROWS = 1;
    private static final int NAME_SAME_TYPE = 3;
    private static final int NAME_WIDENS = 2;
    private final List trees;

    public GeneralSubtrees(DerValue derValue) throws IOException {
        this();
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding of GeneralSubtrees.");
            throw null;
        }
        while (derValue.data.available() != 0) {
            add(new GeneralSubtree(derValue.data.getDerValue()));
        }
    }

    private GeneralSubtree createWidestSubtree(GeneralNameInterface generalNameInterface) {
        GeneralName generalName;
        try {
            switch (generalNameInterface.getType()) {
                case 0:
                    generalName = new GeneralName(new OtherName(((OtherName) generalNameInterface).getOID(), null));
                    break;
                case 1:
                    generalName = new GeneralName(new RFC822Name(""));
                    break;
                case 2:
                    generalName = new GeneralName(new DNSName(""));
                    break;
                case 3:
                    generalName = new GeneralName(new X400Address((byte[]) null));
                    break;
                case 4:
                    generalName = new GeneralName(new X500Name(""));
                    break;
                case 5:
                    generalName = new GeneralName(new EDIPartyName(""));
                    break;
                case 6:
                    generalName = new GeneralName(new URIName(""));
                    break;
                case 7:
                    generalName = new GeneralName(new IPAddressName((byte[]) null));
                    break;
                case 8:
                    generalName = new GeneralName(new OIDName(new ObjectIdentifier((int[]) null)));
                    break;
                default:
                    throw new IOException("Unsupported GeneralNameInterface type: " + generalNameInterface.getType());
            }
            return new GeneralSubtree(generalName, 0, -1);
        } catch (IOException e) {
            throw new RuntimeException("Unexpected error: " + e, e);
        }
    }

    private GeneralNameInterface getGeneralNameInterface(int i) {
        return getGeneralNameInterface(get(i));
    }

    private void minimize() {
        int i = 0;
        while (i < size()) {
            GeneralNameInterface generalNameInterface = getGeneralNameInterface(i);
            int i2 = i + 1;
            while (i2 < size()) {
                int constrains = generalNameInterface.constrains(getGeneralNameInterface(i2));
                if (constrains != -1) {
                    if (constrains != 0) {
                        if (constrains == 1) {
                            remove(i2);
                            i2--;
                        } else if (constrains != 2) {
                            if (constrains != 3) {
                                break;
                            }
                        }
                    }
                    remove(i);
                    i--;
                    break;
                }
                i2++;
            }
            i++;
        }
    }

    public void add(GeneralSubtree generalSubtree) {
        generalSubtree.getClass();
        this.trees.add(generalSubtree);
    }

    public Object clone() {
        return new GeneralSubtrees(this);
    }

    public boolean contains(GeneralSubtree generalSubtree) {
        generalSubtree.getClass();
        return this.trees.contains(generalSubtree);
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        int size = size();
        for (int i = 0; i < size; i++) {
            get(i).encode(derOutputStream2);
        }
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneralSubtrees) {
            return this.trees.equals(((GeneralSubtrees) obj).trees);
        }
        return false;
    }

    public GeneralSubtree get(int i) {
        return (GeneralSubtree) this.trees.get(i);
    }

    public int hashCode() {
        return this.trees.hashCode();
    }

    public GeneralSubtrees intersect(GeneralSubtrees generalSubtrees) {
        GeneralSubtrees generalSubtrees2 = null;
        if (generalSubtrees == null) {
            ny61.t("other GeneralSubtrees must not be null");
            return null;
        }
        GeneralSubtrees generalSubtrees3 = new GeneralSubtrees();
        if (size() == 0) {
            union(generalSubtrees);
            return null;
        }
        minimize();
        generalSubtrees.minimize();
        int i = 0;
        while (i < size()) {
            GeneralNameInterface generalNameInterface = getGeneralNameInterface(i);
            boolean z = false;
            for (int i2 = 0; i2 < generalSubtrees.size(); i2++) {
                GeneralSubtree generalSubtree = generalSubtrees.get(i2);
                int constrains = generalNameInterface.constrains(getGeneralNameInterface(generalSubtree));
                if (constrains != 0) {
                    if (constrains == 1) {
                        remove(i);
                        i--;
                        generalSubtrees3.add(generalSubtree);
                    } else if (constrains != 2) {
                        if (constrains == 3) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                boolean z2 = false;
                for (int i3 = 0; i3 < size(); i3++) {
                    GeneralNameInterface generalNameInterface2 = getGeneralNameInterface(i3);
                    if (generalNameInterface2.getType() == generalNameInterface.getType()) {
                        for (int i4 = 0; i4 < generalSubtrees.size(); i4++) {
                            int constrains2 = generalNameInterface2.constrains(generalSubtrees.getGeneralNameInterface(i4));
                            if (constrains2 == 0 || constrains2 == 2 || constrains2 == 1) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                if (!z2) {
                    if (generalSubtrees2 == null) {
                        generalSubtrees2 = new GeneralSubtrees();
                    }
                    GeneralSubtree createWidestSubtree = createWidestSubtree(generalNameInterface);
                    if (!generalSubtrees2.contains(createWidestSubtree)) {
                        generalSubtrees2.add(createWidestSubtree);
                    }
                }
                remove(i);
                i--;
            }
            i++;
        }
        if (generalSubtrees3.size() > 0) {
            union(generalSubtrees3);
        }
        for (int i5 = 0; i5 < generalSubtrees.size(); i5++) {
            GeneralSubtree generalSubtree2 = generalSubtrees.get(i5);
            GeneralNameInterface generalNameInterface3 = getGeneralNameInterface(generalSubtree2);
            boolean z3 = false;
            for (int i6 = 0; i6 < size(); i6++) {
                int constrains3 = getGeneralNameInterface(i6).constrains(generalNameInterface3);
                if (constrains3 != -1) {
                    if (constrains3 == 0 || constrains3 == 1 || constrains3 == 2 || constrains3 == 3) {
                        z3 = false;
                        break;
                    }
                } else {
                    z3 = true;
                }
            }
            if (z3) {
                add(generalSubtree2);
            }
        }
        return generalSubtrees2;
    }

    public Iterator iterator() {
        return this.trees.iterator();
    }

    public void reduce(GeneralSubtrees generalSubtrees) {
        if (generalSubtrees == null) {
            return;
        }
        int size = generalSubtrees.size();
        for (int i = 0; i < size; i++) {
            GeneralNameInterface generalNameInterface = generalSubtrees.getGeneralNameInterface(i);
            int i2 = 0;
            while (i2 < size()) {
                int constrains = generalNameInterface.constrains(getGeneralNameInterface(i2));
                if (constrains == 0 || constrains == 1) {
                    remove(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    public void remove(int i) {
        this.trees.remove(i);
    }

    public int size() {
        return this.trees.size();
    }

    public String toString() {
        return "   GeneralSubtrees:\n" + this.trees.toString() + "\n";
    }

    public List trees() {
        return this.trees;
    }

    public void union(GeneralSubtrees generalSubtrees) {
        if (generalSubtrees != null) {
            int size = generalSubtrees.size();
            for (int i = 0; i < size; i++) {
                add(generalSubtrees.get(i));
            }
            minimize();
        }
    }

    private static GeneralNameInterface getGeneralNameInterface(GeneralSubtree generalSubtree) {
        return generalSubtree.getName().getName();
    }

    public GeneralSubtrees() {
        this.trees = new ArrayList();
    }

    private GeneralSubtrees(GeneralSubtrees generalSubtrees) {
        this.trees = new ArrayList(generalSubtrees.trees);
    }
}
