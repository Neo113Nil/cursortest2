package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import coil3.graphics.EnumC0136DataSource;
import coil3.size.Scale;
import com.yandex.go.image.api.domain.models.ImageSource;
import com.yandex.go.image.internal.coil.model.TagBitmapDecodeType;

/* loaded from: classes.dex */
public abstract class vac {
    public static final m16 a = new m16(0);

    public static final Bitmap a(mev mevVar) {
        q7v f = mevVar.f();
        if (f instanceof sac) {
            return ((sac) f).a.a;
        }
        if (f instanceof w06) {
            return ((w06) f).a;
        }
        return null;
    }

    public static final ImageSource b(EnumC0136DataSource enumC0136DataSource) {
        int i = uac.a[enumC0136DataSource.ordinal()];
        if (i == 1 || i == 2) {
            return ImageSource.MEMORY;
        }
        if (i == 3) {
            return ImageSource.DISK;
        }
        if (i == 4) {
            return ImageSource.NETWORK;
        }
        w511.b();
        return null;
    }

    public static final void c(aev aevVar, tbv tbvVar, sls slsVar) {
        if (tbvVar instanceof obv) {
            aevVar.b().b(clx.a, TagBitmapDecodeType.View);
            int intValue = ((Number) slsVar.invoke()).intValue();
            aevVar.b().b(clx.b, Integer.valueOf(intValue));
            aevVar.b().b(clx.c, Integer.valueOf(((obv) tbvVar).d));
            String valueOf = String.valueOf(intValue);
            if (valueOf != null) {
                aevVar.c().put("view_tag_processing", valueOf);
            } else {
                aevVar.c().remove("view_tag_processing");
            }
        }
    }

    public static final void d(aev aevVar, int i, int i2) {
        okj okjVar;
        okj okjVar2 = mkj.a;
        if (i > 0) {
            cvw.a(i);
            okjVar = new kkj(i);
        } else {
            okjVar = okjVar2;
        }
        if (i2 > 0) {
            cvw.a(i2);
            okjVar2 = new kkj(i2);
        }
        aevVar.getClass();
        aevVar.o = new idi0(new xis0(okjVar, okjVar2));
    }

    public static final aev e(aev aevVar, Context context, tfv tfvVar) {
        if (tfvVar instanceof pfv) {
            return aevVar;
        }
        int i = 0;
        int i2 = 1;
        if (tfvVar instanceof mfv) {
            aevVar.p = Scale.FILL;
            kev.a(aevVar, o69.a);
            return aevVar;
        }
        if (tfvVar instanceof nfv) {
            aevVar.p = Scale.FILL;
            kev.a(aevVar, hub.a);
            return aevVar;
        }
        if (tfvVar instanceof ofv) {
            kev.a(aevVar, odr.a);
            return aevVar;
        }
        if (tfvVar instanceof qfv) {
            aevVar.p = Scale.FILL;
            kev.a(aevVar, new dee0((qfv) tfvVar, i));
            return aevVar;
        }
        if (tfvVar instanceof rfv) {
            kev.a(aevVar, new dee0((rfv) tfvVar, i2));
            return aevVar;
        }
        if (!(tfvVar instanceof sfv)) {
            w511.b();
            return null;
        }
        aevVar.p = Scale.FILL;
        kev.a(aevVar, new qxk0(context, (sfv) tfvVar));
        return aevVar;
    }
}
