package defpackage;

import android.content.res.Configuration;
import com.yandex.plus.bdui.plus.checkout.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class g1e extends kpj {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1e(h hVar) {
        super(true);
        this.b = 6;
        this.c = hVar;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        int i = this.b;
        int i2 = 1;
        Continuation continuation = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                u1e u1eVar = ((h1e) obj).j;
                if (u1eVar != null) {
                    u1eVar.d();
                    return;
                } else {
                    Intrinsics.j("presenter");
                    throw null;
                }
            case 1:
                ((Function1) obj).invoke(this);
                return;
            case 2:
                ddl ddlVar = jdl.G;
                grl B = ((jdl) obj).B();
                xdr xdrVar = B.x;
                if (B.E.a.getValue() instanceof fve) {
                    if (xdrVar.getValue() == evo.b) {
                        xdrVar.m(null, evo.a);
                        return;
                    }
                    xdr xdrVar2 = B.w;
                    hql hqlVar = hql.b;
                    xdrVar2.getClass();
                    xdrVar2.m(null, hqlVar);
                    return;
                }
                return;
            case 3:
                b6p b6pVar = (b6p) obj;
                xdr xdrVar3 = b6pVar.q;
                boolean z = ((Boolean) xdrVar3.getValue()).booleanValue() && (b6pVar.n || (((CharSequence) b6pVar.K().o.a.getValue()).length() == 0));
                p6p K = b6pVar.K();
                boolean z2 = K.q.a.getValue() != m6p.a;
                if (z2) {
                    xdr xdrVar4 = K.l;
                    Boolean bool = Boolean.TRUE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool);
                }
                if (!z2 && !z) {
                    setEnabled(false);
                    b6pVar.requireActivity().getOnBackPressedDispatcher().d();
                    setEnabled(true);
                    return;
                } else {
                    b6pVar.L();
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool2);
                    return;
                }
            case 4:
                e8s e8sVar = (e8s) ((h7s) obj).i.getValue();
                x97.y(ot0.F(e8sVar), null, null, new b8s(e8sVar, continuation, i2), 3);
                return;
            case 5:
                VideoClipActivity videoClipActivity = (VideoClipActivity) obj;
                if (asq.H(videoClipActivity)) {
                    Configuration configuration = videoClipActivity.getResources().getConfiguration();
                    configuration.getClass();
                    if (!(configuration.smallestScreenWidthDp >= 600)) {
                        x8u x8uVar = x8u.LANDSCAPE;
                        videoClipActivity.setRequestedOrientation(1);
                        return;
                    }
                }
                videoClipActivity.finish();
                sb.q(videoClipActivity);
                return;
            default:
                ((h) obj).invoke();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1e(int i, Object obj) {
        super(true);
        this.b = i;
        this.c = obj;
    }
}
