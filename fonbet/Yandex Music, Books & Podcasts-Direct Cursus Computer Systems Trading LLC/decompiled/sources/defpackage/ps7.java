package defpackage;

import androidx.media3.exoplayer.trackselection.a;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ps7 implements zs7, jhs, u9t {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ps7(vqn vqnVar, ArrayList arrayList, Object obj, boolean z, int i) {
        this.a = i;
        this.c = vqnVar;
        this.d = arrayList;
        this.e = obj;
        this.b = z;
    }

    @Override // defpackage.u9t
    public void a(Exception exc) {
        ozn oznVar = (ozn) this.c;
        i8s i8sVar = (i8s) this.d;
        rb2 rb2Var = (rb2) this.e;
        if (exc != null) {
            i8sVar.c(exc);
            return;
        }
        if (this.b) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new zvh(19, oznVar, countDownLatch)).start();
            ExecutorService executorService = nvt.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        j = nanoTime - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        i8sVar.d(rb2Var);
    }

    @Override // defpackage.jhs
    public void b(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 1:
                final vqn vqnVar = (vqn) this.c;
                final ArrayList arrayList = (ArrayList) this.d;
                final rjf rjfVar = (rjf) this.e;
                if (i <= 50 || (i2 = vqnVar.a) >= 3) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    vqnVar.a = i2 + 1;
                }
                if (arrayList.size() >= 10) {
                    l5v l5vVar = (l5v) rjfVar.f;
                    if (l5vVar != null) {
                        l5vVar.setFpsInfoCallback(null);
                    }
                    final int p0 = 1000 / (CollectionsKt.p0(arrayList) / arrayList.size());
                    StringBuilder sb = new StringBuilder("onAnimationFpsMeasured(optimize=");
                    final boolean z = this.b;
                    sb.append(z);
                    sb.append("): fps=");
                    sb.append(p0);
                    ssg.a(3, "WaveBackgroundPresenter", sb.toString(), null);
                    final int i4 = 0;
                    pld.a(new Function0() { // from class: ojf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            l5v l5vVar2;
                            switch (i4) {
                                case 0:
                                    rjf rjfVar2 = (rjf) rjfVar;
                                    int i5 = p0;
                                    boolean z2 = true;
                                    boolean z3 = i5 > 25;
                                    rjfVar2.a = z3;
                                    dhn dhnVar = dhn.b;
                                    int i6 = vqnVar.a;
                                    ArrayList arrayList2 = arrayList;
                                    boolean z4 = z;
                                    dhnVar.h(z3, i5, arrayList2, i6, z4);
                                    if (rjfVar2.a) {
                                        dys dysVar = (dys) rjfVar2.o;
                                        if (dysVar != null && (l5vVar2 = (l5v) rjfVar2.f) != null) {
                                            l5vVar2.setTrackMoodSpecs(dysVar);
                                        }
                                    } else {
                                        l5v l5vVar3 = (l5v) rjfVar2.f;
                                        if (!z4) {
                                            if (l5vVar3 != null) {
                                                l5vVar3.e();
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            vqn vqnVar2 = new vqn();
                                            l5v l5vVar4 = (l5v) rjfVar2.f;
                                            if (l5vVar4 != null) {
                                                l5vVar4.setFpsInfoCallback(new ps7(vqnVar2, arrayList3, rjfVar2, z2, 1));
                                            }
                                        } else if (l5vVar3 != null) {
                                            l5vVar3.d(false);
                                        }
                                    }
                                    break;
                                default:
                                    l0v l0vVar = (l0v) rjfVar;
                                    int i7 = p0;
                                    boolean z5 = true;
                                    boolean z6 = i7 > 25;
                                    l0vVar.f = z6;
                                    dhn dhnVar2 = dhn.b;
                                    int i8 = vqnVar.a;
                                    ArrayList arrayList4 = arrayList;
                                    boolean z7 = z;
                                    dhnVar2.h(z6, i7, arrayList4, i8, z7);
                                    if (l0vVar.f) {
                                        r3v r3vVar = l0vVar.h;
                                        if (r3vVar != null) {
                                            l0vVar.c(r3vVar);
                                        }
                                    } else {
                                        WaveGlShaderView waveGlShaderView = l0vVar.e;
                                        if (!z7) {
                                            if (waveGlShaderView != null) {
                                                waveGlShaderView.e();
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            vqn vqnVar3 = new vqn();
                                            WaveGlShaderView waveGlShaderView2 = l0vVar.e;
                                            if (waveGlShaderView2 != null) {
                                                waveGlShaderView2.setFpsInfoCallback(new ps7(vqnVar3, arrayList5, l0vVar, z5, 3));
                                            }
                                        } else if (waveGlShaderView != null) {
                                            waveGlShaderView.d(false);
                                        }
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    break;
                }
                break;
            default:
                final vqn vqnVar2 = (vqn) this.c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final l0v l0vVar = (l0v) this.e;
                if (i <= 50 || (i3 = vqnVar2.a) >= 3) {
                    arrayList2.add(Integer.valueOf(i));
                } else {
                    vqnVar2.a = i3 + 1;
                }
                if (arrayList2.size() >= 10) {
                    WaveGlShaderView waveGlShaderView = l0vVar.e;
                    if (waveGlShaderView != null) {
                        waveGlShaderView.setFpsInfoCallback(null);
                    }
                    final int p02 = 1000 / (CollectionsKt.p0(arrayList2) / arrayList2.size());
                    StringBuilder sb2 = new StringBuilder("onAnimationFpsMeasured(optimize=");
                    final boolean z2 = this.b;
                    sb2.append(z2);
                    sb2.append("): fps=");
                    sb2.append(p02);
                    ssg.a(3, "WaveScreenBackgroundPresenter", sb2.toString(), null);
                    final int i5 = 1;
                    pld.a(new Function0() { // from class: ojf
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            l5v l5vVar2;
                            switch (i5) {
                                case 0:
                                    rjf rjfVar2 = (rjf) l0vVar;
                                    int i52 = p02;
                                    boolean z22 = true;
                                    boolean z3 = i52 > 25;
                                    rjfVar2.a = z3;
                                    dhn dhnVar = dhn.b;
                                    int i6 = vqnVar2.a;
                                    ArrayList arrayList22 = arrayList2;
                                    boolean z4 = z2;
                                    dhnVar.h(z3, i52, arrayList22, i6, z4);
                                    if (rjfVar2.a) {
                                        dys dysVar = (dys) rjfVar2.o;
                                        if (dysVar != null && (l5vVar2 = (l5v) rjfVar2.f) != null) {
                                            l5vVar2.setTrackMoodSpecs(dysVar);
                                        }
                                    } else {
                                        l5v l5vVar3 = (l5v) rjfVar2.f;
                                        if (!z4) {
                                            if (l5vVar3 != null) {
                                                l5vVar3.e();
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            vqn vqnVar22 = new vqn();
                                            l5v l5vVar4 = (l5v) rjfVar2.f;
                                            if (l5vVar4 != null) {
                                                l5vVar4.setFpsInfoCallback(new ps7(vqnVar22, arrayList3, rjfVar2, z22, 1));
                                            }
                                        } else if (l5vVar3 != null) {
                                            l5vVar3.d(false);
                                        }
                                    }
                                    break;
                                default:
                                    l0v l0vVar2 = (l0v) l0vVar;
                                    int i7 = p02;
                                    boolean z5 = true;
                                    boolean z6 = i7 > 25;
                                    l0vVar2.f = z6;
                                    dhn dhnVar2 = dhn.b;
                                    int i8 = vqnVar2.a;
                                    ArrayList arrayList4 = arrayList2;
                                    boolean z7 = z2;
                                    dhnVar2.h(z6, i7, arrayList4, i8, z7);
                                    if (l0vVar2.f) {
                                        r3v r3vVar = l0vVar2.h;
                                        if (r3vVar != null) {
                                            l0vVar2.c(r3vVar);
                                        }
                                    } else {
                                        WaveGlShaderView waveGlShaderView2 = l0vVar2.e;
                                        if (!z7) {
                                            if (waveGlShaderView2 != null) {
                                                waveGlShaderView2.e();
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            vqn vqnVar3 = new vqn();
                                            WaveGlShaderView waveGlShaderView22 = l0vVar2.e;
                                            if (waveGlShaderView22 != null) {
                                                waveGlShaderView22.setFpsInfoCallback(new ps7(vqnVar3, arrayList5, l0vVar2, z5, 3));
                                            }
                                        } else if (waveGlShaderView2 != null) {
                                            waveGlShaderView2.d(false);
                                        }
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                    break;
                }
                break;
        }
    }

    @Override // defpackage.zs7
    public qsn h(int i, xvs xvsVar, int[] iArr) {
        ct7 ct7Var = (ct7) this.c;
        a aVar = (a) this.d;
        int[] iArr2 = (int[]) this.e;
        ct7Var.getClass();
        qs7 qs7Var = new qs7(ct7Var, aVar);
        int i2 = iArr2[i];
        tde u = yde.u();
        for (int i3 = 0; i3 < xvsVar.a; i3++) {
            u.a(new rs7(i, xvsVar, i3, aVar, iArr[i3], this.b, qs7Var, i2));
        }
        return u.f();
    }

    public /* synthetic */ ps7(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
