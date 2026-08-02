package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.common.YSError;

/* loaded from: classes2.dex */
public final /* synthetic */ class qw5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ zgf b;

    public /* synthetic */ qw5(xw5 xw5Var, zgf zgfVar, int i) {
        this.a = i;
        this.b = zgfVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        final int i2 = 0;
        final int i3 = 1;
        zy11 zy11Var = zy11.a;
        final zgf zgfVar = this.b;
        switch (i) {
            case 0:
                final avv a = xw5.a((yuv) obj);
                if (a == null) {
                    n891.n(new sls() { // from class: tw5
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            zgf zgfVar2 = zgfVar;
                            switch (i4) {
                                case 0:
                                    PaymentKitError.Companion.getClass();
                                    zgfVar2.i(a.d("Cannot map init verification response"));
                                    break;
                                default:
                                    PaymentKitError.Companion.getClass();
                                    zgfVar2.i(a.d("Cannot map init verification response"));
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    break;
                } else {
                    n891.n(new sls() { // from class: sw5
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            avv avvVar = a;
                            zgf zgfVar2 = zgfVar;
                            switch (i4) {
                                case 0:
                                    zgfVar2.onSuccess(avvVar);
                                    break;
                                default:
                                    zgfVar2.onSuccess(avvVar);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    break;
                }
            case 1:
                final YSError ySError = (YSError) obj;
                n891.n(new sls() { // from class: rw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        zy11 zy11Var2 = zy11.a;
                        YSError ySError2 = ySError;
                        zgf zgfVar2 = zgfVar;
                        switch (i4) {
                            case 0:
                                PaymentKitError.Companion.getClass();
                                zgfVar2.i(a.b(ySError2));
                                break;
                            default:
                                PaymentKitError.Companion.getClass();
                                zgfVar2.i(a.b(ySError2));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
            case 2:
                final avv a2 = xw5.a((yuv) obj);
                if (a2 == null) {
                    n891.n(new sls() { // from class: tw5
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            zgf zgfVar2 = zgfVar;
                            switch (i4) {
                                case 0:
                                    PaymentKitError.Companion.getClass();
                                    zgfVar2.i(a.d("Cannot map init verification response"));
                                    break;
                                default:
                                    PaymentKitError.Companion.getClass();
                                    zgfVar2.i(a.d("Cannot map init verification response"));
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    break;
                } else {
                    n891.n(new sls() { // from class: sw5
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            avv avvVar = a2;
                            zgf zgfVar2 = zgfVar;
                            switch (i4) {
                                case 0:
                                    zgfVar2.onSuccess(avvVar);
                                    break;
                                default:
                                    zgfVar2.onSuccess(avvVar);
                                    break;
                            }
                            return zy11Var2;
                        }
                    });
                    break;
                }
            default:
                final YSError ySError2 = (YSError) obj;
                n891.n(new sls() { // from class: rw5
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        zy11 zy11Var2 = zy11.a;
                        YSError ySError22 = ySError2;
                        zgf zgfVar2 = zgfVar;
                        switch (i4) {
                            case 0:
                                PaymentKitError.Companion.getClass();
                                zgfVar2.i(a.b(ySError22));
                                break;
                            default:
                                PaymentKitError.Companion.getClass();
                                zgfVar2.i(a.b(ySError22));
                                break;
                        }
                        return zy11Var2;
                    }
                });
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ qw5(zgf zgfVar, int i) {
        this.a = i;
        this.b = zgfVar;
    }
}
