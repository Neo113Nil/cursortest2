package defpackage;

import com.yandex.go.eboks.objects.ui.a;
import com.yandex.mapkit.map.CompositeIcon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class yhn extends r8 {
    public final hz40 A;
    public final r58 B;
    public final b01 C;
    public final tgn c;
    public final dhn w;
    public final a x;
    public final din y;
    public final hz40 z;

    public yhn(ah00 ah00Var, tgn tgnVar, dhn dhnVar, a aVar, din dinVar) {
        super(5, ah00Var);
        this.c = tgnVar;
        this.w = dhnVar;
        this.x = aVar;
        this.y = dinVar;
        this.z = cmm0.b();
        this.A = cmm0.b();
        this.B = new r58(1, this);
        this.C = new b01(6, this);
    }

    public static final void Hg(yhn yhnVar, vj00 vj00Var, boolean z) {
        Collection values;
        f4c0 f4c0Var = (f4c0) yhnVar.A.d(vj00Var.getId());
        if (f4c0Var == null) {
            return;
        }
        boolean z2 = vj00Var instanceof mhn;
        if (!z2) {
            if (vj00Var instanceof ohn) {
                Kg(f4c0Var, (ohn) vj00Var, z);
                return;
            } else {
                w511.b();
                return;
            }
        }
        tgn tgnVar = yhnVar.c;
        mhn mhnVar = (mhn) vj00Var;
        String str = mhnVar.a;
        List list = EmptyList.a;
        if (z2) {
            lhn lhnVar = mhnVar.f;
            if (lhnVar != null && (values = lhnVar.a.values()) != null) {
                list = tcc.o(values);
            }
        } else if (!(vj00Var instanceof ohn)) {
            w511.b();
            return;
        }
        tgnVar.b(str, list, yhnVar.w);
        Jg(f4c0Var, mhnVar, z);
    }

    public static void Jg(f4c0 f4c0Var, mhn mhnVar, boolean z) {
        float floatValue;
        ImageProvider imageProvider;
        ImageProvider imageProvider2;
        if (z) {
            floatValue = Float.MAX_VALUE;
        } else {
            Float f = mhnVar.b.b;
            floatValue = f != null ? f.floatValue() : 0.0f;
        }
        f4c0Var.k(floatValue);
        CompositeIcon useCompositeIcon = ((PlacemarkMapObject) f4c0Var.g).useCompositeIcon();
        qhn qhnVar = mhnVar.b;
        qhn qhnVar2 = mhnVar.e;
        ImageProvider imageProvider3 = qhnVar.e;
        if (z && (imageProvider2 = qhnVar.g) != null) {
            imageProvider3 = imageProvider2;
        }
        IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(z ? qhnVar.f : qhnVar.d);
        iconStyle.setZIndex(Float.valueOf(0.0f));
        useCompositeIcon.setIcon("ICON_BODY", imageProvider3, iconStyle);
        List list = qhnVar.c;
        if (list != null) {
            f4c0Var.C(list);
        }
        if (qhnVar2 != null) {
            ImageProvider imageProvider4 = qhnVar2.e;
            if (z && (imageProvider = qhnVar2.g) != null) {
                imageProvider4 = imageProvider;
            }
            IconStyle iconStyle2 = new IconStyle();
            iconStyle2.setAnchor(z ? qhnVar2.f : qhnVar2.d);
            iconStyle2.setZIndex(Float.valueOf(1.0f));
            useCompositeIcon.setIcon("ICON_OVERLAY", imageProvider4, iconStyle2);
        }
    }

    public static void Kg(f4c0 f4c0Var, ohn ohnVar, boolean z) {
        ImageProvider imageProvider;
        qhn qhnVar = ohnVar.b;
        ImageProvider imageProvider2 = qhnVar.e;
        if (z && (imageProvider = qhnVar.g) != null) {
            imageProvider2 = imageProvider;
        }
        f4c0Var.y(imageProvider2);
        IconStyle iconStyle = new IconStyle();
        qhn qhnVar2 = ohnVar.b;
        f4c0Var.D(iconStyle.setAnchor(z ? qhnVar2.f : qhnVar2.d));
        Float f = qhnVar2.b;
        f4c0Var.k(f != null ? f.floatValue() : 0.0f);
    }

    public final void Ig(xm00 xm00Var, Set set, ArrayList arrayList) {
        this.c.a(arrayList.size(), this.w);
        Iterator it = xm00Var.q(arrayList).iterator();
        Iterator it2 = set.iterator();
        while (it.hasNext() && it2.hasNext()) {
            f4c0 f4c0Var = (f4c0) it.next();
            vj00 vj00Var = (vj00) it2.next();
            Kg(f4c0Var, (ohn) vj00Var, false);
            f4c0Var.h(vj00Var);
            this.A.o(vj00Var.getId(), f4c0Var);
        }
    }

    public final void Lg(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f4c0 f4c0Var = (f4c0) this.A.m(((vj00) it.next()).getId());
            if (f4c0Var != null) {
                f4c0Var.d();
            }
        }
    }
}
