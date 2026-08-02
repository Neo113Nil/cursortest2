package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class R2 implements InterfaceC3352i1, InterfaceC3765pl {

    /* renamed from: v, reason: collision with root package name */
    public static final R2 f27912v;

    /* renamed from: w, reason: collision with root package name */
    public static final R2 f27913w;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27914n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27915u;

    static {
        int i = 0;
        f27912v = new R2(i, true);
        f27913w = new R2(i, false);
    }

    public /* synthetic */ R2(int i) {
        this.f27914n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3765pl, com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        InterfaceC3603ml interfaceC3603ml = (InterfaceC3603ml) obj;
        switch (this.f27914n) {
            case 1:
                interfaceC3603ml.s(this.f27915u);
                break;
            default:
                interfaceC3603ml.w(this.f27915u);
                break;
        }
    }

    public String toString() {
        switch (this.f27914n) {
            case 0:
                boolean z6 = !this.f27915u;
                StringBuilder sb = new StringBuilder(String.valueOf(z6).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z6);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ R2(int i, boolean z6) {
        this.f27914n = i;
        this.f27915u = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        if (r9.h(8) == 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R2(C4115wB c4115wB, C3200fB c3200fB) {
        this.f27914n = 5;
        int i = c3200fB.f31021a;
        boolean z6 = false;
        AbstractC2792Sd.i(i == 6 || i == 3);
        ByteBuffer byteBuffer = c3200fB.f31022b;
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        C4256yr c4256yr = new C4256yr(bArr, min);
        if (!c4115wB.f35571a) {
            if (!c4256yr.g()) {
                int h3 = c4256yr.h(2);
                boolean g9 = c4256yr.g();
                if (c4115wB.f35572b) {
                    throw new TA();
                }
                if (g9) {
                    boolean g10 = (h3 == 3 || h3 == 0) ? true : c4256yr.g();
                    c4256yr.e();
                    if (c4115wB.f35574d) {
                        if (c4256yr.g()) {
                            if (c4115wB.f35575e) {
                                c4256yr.e();
                            } else {
                                throw new TA();
                            }
                        }
                        if (!c4115wB.f35573c) {
                            if (h3 != 3) {
                                c4256yr.e();
                            }
                            c4256yr.f(c4115wB.f35576f);
                            if (h3 != 2 && h3 != 0 && !g10) {
                                c4256yr.f(3);
                            }
                            if (h3 != 3) {
                                if (h3 != 0) {
                                }
                            }
                        } else {
                            throw new TA();
                        }
                    } else {
                        throw new TA();
                    }
                }
                z6 = true;
            }
            this.f27915u = z6;
            return;
        }
        throw new TA();
    }
}
