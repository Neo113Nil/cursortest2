package defpackage;

import androidx.core.app.q;
import androidx.glance.appwidget.protobuf.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mqf extends b {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final mqf DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile l7k PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private sse children_ = czm.d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        mqf mqfVar = new mqf();
        DEFAULT_INSTANCE = mqfVar;
        b.i(mqf.class, mqfVar);
    }

    public static void k(mqf mqfVar, nqf nqfVar) {
        mqfVar.getClass();
        if (nqfVar != nqf.UNRECOGNIZED) {
            mqfVar.type_ = nqfVar.a;
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
    }

    public static void l(mqf mqfVar, fqf fqfVar) {
        mqfVar.getClass();
        mqfVar.width_ = fqfVar.a();
    }

    public static void m(mqf mqfVar, fqf fqfVar) {
        mqfVar.getClass();
        mqfVar.height_ = fqfVar.a();
    }

    public static void n(mqf mqfVar, gqf gqfVar) {
        mqfVar.getClass();
        if (gqfVar != gqf.UNRECOGNIZED) {
            mqfVar.horizontalAlignment_ = gqfVar.a;
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
    }

    public static void o(mqf mqfVar, oqf oqfVar) {
        mqfVar.getClass();
        if (oqfVar != oqf.UNRECOGNIZED) {
            mqfVar.verticalAlignment_ = oqfVar.a;
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
    }

    public static void p(mqf mqfVar, eqf eqfVar) {
        mqfVar.getClass();
        if (eqfVar != eqf.UNRECOGNIZED) {
            mqfVar.imageScale_ = eqfVar.a;
        } else {
            xq0.x("Can't get the number of an unknown enum value.");
        }
    }

    public static void q(mqf mqfVar) {
        mqfVar.getClass();
        mqfVar.identity_ = 1;
    }

    public static void r(mqf mqfVar, boolean z) {
        mqfVar.hasAction_ = z;
    }

    public static void s(mqf mqfVar, ArrayList arrayList) {
        sse sseVar = mqfVar.children_;
        if (!((v8) sseVar).a) {
            int size = sseVar.size();
            mqfVar.children_ = ((czm) sseVar).m(size == 0 ? 10 : size * 2);
        }
        List list = mqfVar.children_;
        Charset charset = vse.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size2 = list.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                jj4.j(str);
                return;
            }
            list.add(next);
        }
    }

    public static void t(mqf mqfVar, boolean z) {
        mqfVar.hasImageDescription_ = z;
    }

    public static void u(mqf mqfVar, boolean z) {
        mqfVar.hasImageColorFilter_ = z;
    }

    public static mqf v() {
        return DEFAULT_INSTANCE;
    }

    public static lqf w() {
        return (lqf) ((h3d) DEFAULT_INSTANCE.b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.b
    public final Object b(int i) {
        l7k l7kVar;
        switch (ouj.D(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ejn(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", mqf.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new mqf();
            case 4:
                return new lqf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                l7k l7kVar2 = PARSER;
                if (l7kVar2 != null) {
                    return l7kVar2;
                }
                synchronized (mqf.class) {
                    try {
                        l7kVar = PARSER;
                        if (l7kVar == null) {
                            l7kVar = new k3d();
                            PARSER = l7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return l7kVar;
            default:
                q.i();
                return null;
        }
    }
}
