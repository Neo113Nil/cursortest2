package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.io.InterruptedIOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class axb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ axb(sdr sdrVar, boolean z, fvf fvfVar) {
        this.a = 0;
        this.c = sdrVar;
        this.b = z;
        this.d = fvfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        byte[] bArr = null;
        Object[] objArr = 0;
        boolean z2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fvf fvfVar = (fvf) obj;
                if (((sdr) obj2).getValue() != ptb.a || (!z2 && fvfVar.h() <= 0)) {
                    z = false;
                }
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj2;
                nzb nzbVar = (nzb) obj;
                try {
                    if (z2) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 80, nzbVar);
                    } else {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, nzbVar);
                    }
                    bArr = nzbVar.o();
                    break;
                } catch (InterruptedIOException unused) {
                    b6e.h();
                    return bArr;
                }
            case 2:
                yhs yhsVar = (yhs) obj2;
                Function1 function1 = (Function1) obj;
                yhsVar.d.setValue(Boolean.FALSE);
                long a = yhsVar.a();
                if (z2) {
                    a = hyf.H(a);
                }
                function1.invoke(new nsa(a));
                break;
            case 3:
                brs brsVar = (brs) obj2;
                mqs mqsVar = (mqs) obj;
                ef3 ef3Var = ef3.b;
                muo muoVar = brsVar.g;
                m mVar = brsVar.d;
                if (muoVar == null) {
                    muoVar = muo.UNKNOWN;
                }
                ef3.g(ef3Var, muoVar, brs.j(mqsVar), z2 ? pe3.GO_TO_PODCAST : pe3.GO_TO_ALBUM);
                mVar.e();
                if (mqsVar.k != dg2.c || ((m8w) ((k8w) brsVar.u.getValue())).b(mqsVar)) {
                    Parcelable.Creator<oq> creator = oq.CREATOR;
                    mVar.u(cxb.O(mqsVar));
                } else {
                    Context context = (Context) mVar.d;
                    context.getClass();
                    hag.x(context, R.string.track_no_rights_title, 0);
                }
                break;
            default:
                n7v n7vVar = (n7v) obj2;
                m6v m6vVar = ((z8v) obj).a;
                p7v p7vVar = n7vVar.d;
                m6vVar.getClass();
                rmb rmbVar = n7vVar.b;
                if (z2) {
                    rmb.a(rmbVar, sjb.Unlike, n7vVar.b(m6vVar), null, 10);
                    p7vVar.a(o6v.b, n7vVar.a().r);
                } else {
                    rmb.a(rmbVar, sjb.Like, n7vVar.b(m6vVar), null, 10);
                    p7vVar.a(o6v.a, n7vVar.a().r);
                }
                n7vVar.h.setValue(n7vVar, n7v.j[0], x97.y(n7vVar.a, null, null, new zts(n7vVar, objArr == true ? 1 : 0, 23), 3));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ axb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ axb(boolean z, Bitmap bitmap, nzb nzbVar) {
        this.a = 1;
        this.b = z;
        this.c = bitmap;
        this.d = nzbVar;
    }
}
