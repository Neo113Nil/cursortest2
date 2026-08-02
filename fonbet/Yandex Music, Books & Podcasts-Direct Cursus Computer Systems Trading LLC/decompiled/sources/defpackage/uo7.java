package defpackage;

import android.os.Message;
import com.yandex.pulse.PowerStateChangeDetector;
import com.yandex.pulse.ProcessCpuMonitoringParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.NetworkChangeDetector;
import com.yandex.pulse.metrics.l;
import com.yandex.pulse.processcpu.MeasurementTask;
import com.yandex.pulse.utils.RunnableScheduler;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class uo7 implements xav, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public uo7(Function1 function1) {
        this.a = 0;
        this.b = (ezc) function1;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xav) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return (ezc) this.b;
            case 1:
                return new ezc(1, 0, MeasurementTask.class, (MeasurementTask) this.b, "onPostExecute", "onPostExecute(Landroid/os/Message;)V");
            case 2:
                return new ezc(1, 0, MetricsState.class, (MetricsState) this.b, "handleStoreMessage", "handleStoreMessage(Landroid/os/Message;)V");
            case 3:
                return new ezc(1, 0, NetworkChangeDetector.class, (NetworkChangeDetector) this.b, "handleMessage", "handleMessage(Landroid/os/Message;)V");
            case 4:
                return new ezc(1, 0, PowerStateChangeDetector.class, (PowerStateChangeDetector) this.b, "handleMessage", "handleMessage(Landroid/os/Message;)V");
            case 5:
                return new ezc(1, 0, PulseService.class, (PulseService) this.b, "handleMessage", "handleMessage(Landroid/os/Message;)V");
            default:
                return new ezc(1, 0, RunnableScheduler.class, (RunnableScheduler) this.b, "handleTimerMessage", "handleTimerMessage(Landroid/os/Message;)V");
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ezc, kotlin.jvm.functions.Function1] */
    @Override // defpackage.xav
    public final void handleMessage(Message message) {
        int a;
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ezc) obj).invoke(message);
                break;
            case 1:
                message.getClass();
                MeasurementTask measurementTask = (MeasurementTask) obj;
                if (!measurementTask.h.get()) {
                    ysm ysmVar = measurementTask.b;
                    cz0 cz0Var = measurementTask.e;
                    xy0 xy0Var = measurementTask.f;
                    xy0 xy0Var2 = measurementTask.g;
                    long j = measurementTask.i;
                    tfh tfhVar = measurementTask.c;
                    ProcessCpuMonitoringParams processCpuMonitoringParams = ysmVar.c;
                    cz0Var.getClass();
                    xy0Var.getClass();
                    xy0Var2.getClass();
                    ysmVar.k = null;
                    ysmVar.l = CollectionsKt.z0(cz0Var);
                    ysmVar.m = xy0Var;
                    if (ysmVar.o != -1) {
                        Iterator it = ((sy0) xy0Var2.entrySet()).iterator();
                        while (true) {
                            vy0 vy0Var = (vy0) it;
                            if (vy0Var.hasNext()) {
                                vy0Var.next();
                                String str = (String) vy0Var.getKey();
                                etm etmVar = (etm) vy0Var.getValue();
                                etm etmVar2 = (etm) ysmVar.n.get(str);
                                if (etmVar2 != null) {
                                    long j2 = etmVar2.a;
                                    if (j2 != -1) {
                                        tfh tfhVar2 = tfhVar;
                                        long j3 = etmVar.a;
                                        if (j3 != -1) {
                                            long j4 = j3 - j2;
                                            long j5 = j - ysmVar.o;
                                            boolean z = tfhVar2.a;
                                            long j6 = z ? 60000L : 3600000L;
                                            String str2 = processCpuMonitoringParams.processToHistogramBaseName.get(str);
                                            str2.getClass();
                                            String l = hrg.l('.', str2, z ? "Foreground" : "Background");
                                            String concat = l.concat(".LARGE");
                                            if (tfhVar2.b) {
                                                l = l.concat(".Charging");
                                                concat = concat.concat(".Charging");
                                            }
                                            ysmVar.f.a(l, j4, j5, j6);
                                            ysmVar.g.a(concat, j4, j5, j6);
                                            ysmVar.e.reportCpuTicks(str, etmVar2.a, j3, j, ysmVar.o, tfhVar2);
                                            processCpuMonitoringParams = processCpuMonitoringParams;
                                            tfhVar = tfhVar2;
                                            it = it;
                                        } else {
                                            tfhVar = tfhVar2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ProcessCpuMonitoringParams processCpuMonitoringParams2 = processCpuMonitoringParams;
                    Iterator it2 = ((sy0) xy0Var2.entrySet()).iterator();
                    while (true) {
                        vy0 vy0Var2 = (vy0) it2;
                        if (!vy0Var2.hasNext()) {
                            ysmVar.n = xy0Var2;
                            ysmVar.o = j;
                            break;
                        } else {
                            vy0Var2.next();
                            String str3 = (String) vy0Var2.getKey();
                            etm etmVar3 = (etm) vy0Var2.getValue();
                            int i3 = etmVar3.b;
                            if (i3 != -1) {
                                String str4 = processCpuMonitoringParams2.processToHistogramBaseName.get(str3);
                                str4.getClass();
                                gao gaoVar = ysmVar.h;
                                gaoVar.getClass();
                                String concat2 = str4.concat(".ThreadCount");
                                ciq ciqVar = (ciq) gaoVar.a;
                                lyd lydVar = (lyd) ciqVar.get(concat2);
                                if (lydVar == null) {
                                    Object obj2 = ComponentHistograms.b;
                                    lydVar = xee.B().b(concat2, 1, 300, 50);
                                    ciqVar.put(concat2, lydVar);
                                }
                                lydVar.b(i3);
                                ysmVar.e.reportThreadCount(str3, i3);
                            }
                            if (etmVar3.c != Long.MIN_VALUE) {
                                String str5 = processCpuMonitoringParams2.processToHistogramBaseName.get(str3);
                                str5.getClass();
                                String str6 = str5;
                                long j7 = etmVar3.c;
                                long j8 = etmVar3.d;
                                ProcessCpuMonitoringParams processCpuMonitoringParams3 = processCpuMonitoringParams2;
                                long j9 = etmVar3.e;
                                sml smlVar = ysmVar.i;
                                smlVar.getClass();
                                long j10 = 1048576;
                                smlVar.o(str6.concat(".PrivateMemoryFootprint")).b((int) (j7 / j10));
                                smlVar.o(str6.concat(".SharedMemoryFootprint")).b((int) (j8 / j10));
                                smlVar.o(str6.concat(".MemoryFootprint")).b((int) (j9 / j10));
                                ysmVar.e.reportMemoryCount(str3, j7, j8, j9);
                                it2 = it2;
                                processCpuMonitoringParams2 = processCpuMonitoringParams3;
                            }
                        }
                    }
                }
                break;
            case 2:
                message.getClass();
                MetricsState metricsState = (MetricsState) obj;
                metricsState.e = false;
                metricsState.c.execute(new zvh(i2, metricsState, ((l) metricsState.d.b()).toByteArray()));
                break;
            case 3:
                message.getClass();
                NetworkChangeDetector networkChangeDetector = (NetworkChangeDetector) obj;
                v4i v4iVar = networkChangeDetector.b;
                int i4 = NetworkChangeDetector.j;
                int i5 = message.what;
                if (i5 == 0) {
                    if (networkChangeDetector.g) {
                        if (!networkChangeDetector.i) {
                            int a2 = networkChangeDetector.a();
                            if (networkChangeDetector.e != a2) {
                                networkChangeDetector.e = a2;
                                v4iVar.a.onConnectionTypeChanged(a2);
                                break;
                            }
                        } else {
                            networkChangeDetector.i = false;
                            break;
                        }
                    }
                } else if (i5 == 1 && networkChangeDetector.g && networkChangeDetector.e != (a = networkChangeDetector.a())) {
                    networkChangeDetector.e = a;
                    v4iVar.a.onConnectionTypeChanged(a);
                    break;
                }
                break;
            case 4:
                message.getClass();
                ((PowerStateChangeDetector) obj).handleMessage(message);
                break;
            case 5:
                message.getClass();
                ((PulseService) obj).handleMessage(message);
                break;
            default:
                message.getClass();
                ((RunnableScheduler) obj).handleTimerMessage(message);
                break;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    public /* synthetic */ uo7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
