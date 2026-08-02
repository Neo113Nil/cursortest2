package com.yandex.passport.internal.ui.domik.identifier;

import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.base.h;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.domik.g;
import com.yandex.passport.internal.ui.util.l;
import defpackage.r1w;
import defpackage.wyf;
import defpackage.x97;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/identifier/c;", "Lcom/yandex/passport/internal/ui/domik/base/a;", "Lcom/yandex/passport/internal/ui/domik/identifier/d;", "Lcom/yandex/passport/internal/ui/domik/d;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class c extends com.yandex.passport.internal.ui.domik.base.a<d, com.yandex.passport.internal.ui.domik.d> {
    public static final /* synthetic */ int w = 0;
    public com.yandex.passport.internal.sloth.credentialmanager.d t;
    public boolean u;
    public g v;

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final m0 F() {
        return m0.NONE;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        str.getClass();
        return false;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.u = bundle.getBoolean("credential_manager_requested", false);
        }
        this.v = (g) requireArguments().getParcelable("credential_manager_result");
        com.yandex.passport.internal.sloth.credentialmanager.d credentialManagerInterface = com.yandex.passport.internal.di.a.a().getCredentialManagerInterface();
        this.t = credentialManagerInterface;
        if (credentialManagerInterface == null) {
            Intrinsics.j("credentialManager");
            throw null;
        }
        t requireActivity = requireActivity();
        requireActivity.getClass();
        credentialManagerInterface.d(requireActivity);
        final int i = 0;
        this.p.r.n(this, new l(this) { // from class: com.yandex.passport.internal.ui.domik.identifier.b
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
            
                if (r5 == null) goto L23;
             */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                String str;
                int i2 = i;
                c cVar = this.b;
                Continuation continuation = null;
                switch (i2) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (!cVar.u) {
                            x97.y(wyf.F(cVar.getLifecycle()), null, null, new r1w(cVar, continuation, 27), 3);
                            break;
                        } else {
                            cVar.p.s.m(new a(null, null, null, false));
                            break;
                        }
                    default:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        g gVar = (g) pair.first;
                        Object obj2 = pair.second;
                        if (obj2 != null) {
                            cVar.o = (e) obj2;
                        }
                        cVar.requireArguments().putParcelable("credential_manager_result", gVar);
                        cVar.v = gVar;
                        if (!com.yandex.plus.pay.ui.core.b.B(gVar.a.D().b.a)) {
                            com.yandex.passport.internal.l D = gVar.a.D();
                            int i3 = D.e.h;
                            if (i3 == 10) {
                                str = D.a;
                            } else {
                                if (i3 != 6 && i3 != 12) {
                                    boolean B = com.yandex.plus.pay.ui.core.b.B(D.b.a);
                                    com.yandex.passport.common.core.g gVar2 = D.e;
                                    if (!B) {
                                        str = gVar2.g;
                                        break;
                                    } else {
                                        String str2 = gVar2.g;
                                        str2.getClass();
                                        str = str2.concat("@yandex-team.ru");
                                    }
                                }
                                str = "";
                            }
                            x97.y(wyf.F(cVar.getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(cVar, new com.yandex.passport.internal.sloth.credentialmanager.a(str, gVar.b, false), continuation, 23), 3);
                            break;
                        } else {
                            cVar.p.u.m(cVar.v);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p.t.n(this, new l(this) { // from class: com.yandex.passport.internal.ui.domik.identifier.b
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
            
                if (r5 == null) goto L23;
             */
            @Override // defpackage.xjj
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onChanged(Object obj) {
                String str;
                int i22 = i2;
                c cVar = this.b;
                Continuation continuation = null;
                switch (i22) {
                    case 0:
                        ((Boolean) obj).getClass();
                        if (!cVar.u) {
                            x97.y(wyf.F(cVar.getLifecycle()), null, null, new r1w(cVar, continuation, 27), 3);
                            break;
                        } else {
                            cVar.p.s.m(new a(null, null, null, false));
                            break;
                        }
                    default:
                        Pair pair = (Pair) obj;
                        pair.getClass();
                        g gVar = (g) pair.first;
                        Object obj2 = pair.second;
                        if (obj2 != null) {
                            cVar.o = (e) obj2;
                        }
                        cVar.requireArguments().putParcelable("credential_manager_result", gVar);
                        cVar.v = gVar;
                        if (!com.yandex.plus.pay.ui.core.b.B(gVar.a.D().b.a)) {
                            com.yandex.passport.internal.l D = gVar.a.D();
                            int i3 = D.e.h;
                            if (i3 == 10) {
                                str = D.a;
                            } else {
                                if (i3 != 6 && i3 != 12) {
                                    boolean B = com.yandex.plus.pay.ui.core.b.B(D.b.a);
                                    com.yandex.passport.common.core.g gVar2 = D.e;
                                    if (!B) {
                                        str = gVar2.g;
                                        break;
                                    } else {
                                        String str2 = gVar2.g;
                                        str2.getClass();
                                        str = str2.concat("@yandex-team.ru");
                                    }
                                }
                                str = "";
                            }
                            x97.y(wyf.F(cVar.getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(cVar, new com.yandex.passport.internal.sloth.credentialmanager.a(str, gVar.b, false), continuation, 23), 3);
                            break;
                        } else {
                            cVar.p.u.m(cVar.v);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
        this.p.t.k(this);
        this.p.r.k(this);
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("credential_manager_requested", this.u);
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        passportProcessGlobalComponent.getClass();
        return E().newIdentifierCredentialManagerViewModel();
    }
}
