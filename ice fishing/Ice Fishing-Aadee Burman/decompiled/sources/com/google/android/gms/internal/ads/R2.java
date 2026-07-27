package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class R2 implements InterfaceC3329i1, InterfaceC3742pl {

    /* renamed from: v, reason: collision with root package name */
    public static final R2 f27156v;

    /* renamed from: w, reason: collision with root package name */
    public static final R2 f27157w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27158n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27159u;

    static {
        int i = 0;
        f27156v = new R2(i, true);
        f27157w = new R2(i, false);
    }

    public /* synthetic */ R2(int i) {
        this.f27158n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        InterfaceC3580ml interfaceC3580ml = (InterfaceC3580ml) obj;
        switch (this.f27158n) {
            case 1:
                interfaceC3580ml.s(this.f27159u);
                break;
            default:
                interfaceC3580ml.x(this.f27159u);
                break;
        }
    }

    public String toString() {
        switch (this.f27158n) {
            case 0:
                boolean z3 = !this.f27159u;
                StringBuilder sb = new StringBuilder(String.valueOf(z3).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z3);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ R2(int i, boolean z3) {
        this.f27158n = i;
        this.f27159u = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r9.h(8) == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R2(C4092wB c4092wB, C3177fB c3177fB) {
        this.f27158n = 5;
        int i = c3177fB.f30234a;
        boolean z3 = false;
        AbstractC2772Sd.i(i == 6 || i == 3);
        ByteBuffer byteBuffer = c3177fB.f30235b;
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C4233yr c4233yr = new C4233yr(bArr, min);
        if (!c4092wB.f34802a) {
            if (!c4233yr.g()) {
                int h9 = c4233yr.h(2);
                boolean g4 = c4233yr.g();
                if (c4092wB.f34803b) {
                    throw new TA();
                }
                if (g4) {
                    boolean g9 = (h9 == 3 || h9 == 0) ? true : c4233yr.g();
                    c4233yr.e();
                    if (c4092wB.f34805d) {
                        if (c4233yr.g()) {
                            if (c4092wB.f34806e) {
                                c4233yr.e();
                            } else {
                                throw new TA();
                            }
                        }
                        if (!c4092wB.f34804c) {
                            if (h9 != 3) {
                                c4233yr.e();
                            }
                            c4233yr.f(c4092wB.f34807f);
                            if (h9 != 2 && h9 != 0 && !g9) {
                                c4233yr.f(3);
                            }
                            if (h9 != 3) {
                                if (h9 != 0) {
                                }
                            }
                        } else {
                            throw new TA();
                        }
                    } else {
                        throw new TA();
                    }
                }
                z3 = true;
            }
            this.f27159u = z3;
            return;
        }
        throw new TA();
    }
}
