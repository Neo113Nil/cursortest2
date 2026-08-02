package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class um31 {
    public static final /* synthetic */ um31 a = new um31();
    public static final i3y b = a.a(new b931(10));

    public static rs10 a() {
        return (rs10) b.getValue();
    }

    public static void b(tt5 tt5Var, final nm31 nm31Var, String str) {
        String concat = str.length() > 0 ? Extension.DOT_CHAR.concat(str) : "";
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setLooping".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i2 = i;
                    vm31 vm31Var = nm31Var;
                    switch (i2) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setVolume".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i2;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.setPlaybackSpeed".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i3;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.play".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i4;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.pause".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i5;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.seekTo".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i6;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getCurrentPosition".concat(concat), a(), obj);
        if (nm31Var != null) {
            final int i7 = 6;
            m2vVar7.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i7;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.VideoPlayerInstanceApi.getBufferedPosition".concat(concat), a(), obj);
        if (nm31Var == null) {
            m2vVar8.G(null);
        } else {
            final int i8 = 7;
            m2vVar8.G(new ee5() { // from class: tm31
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    int i22 = i8;
                    vm31 vm31Var = nm31Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((nm31) vm31Var).w.setRepeatMode(((Boolean) ((List) obj2).get(0)).booleanValue() ? 2 : 0);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g5 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 1:
                            try {
                                ((nm31) vm31Var).w.setVolume((float) Math.max(0.0d, Math.min(1.0d, ((Double) ((List) obj2).get(0)).doubleValue())));
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g6 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 2:
                            double doubleValue = ((Double) ((List) obj2).get(0)).doubleValue();
                            try {
                                nm31 nm31Var2 = (nm31) vm31Var;
                                nm31Var2.getClass();
                                nm31Var2.w.setPlaybackParameters(new lxc0((float) doubleValue));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                g7 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 3:
                            try {
                                ((nm31) vm31Var).w.play();
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g3 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 4:
                            try {
                                ((nm31) vm31Var).w.pause();
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g4 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 5:
                            try {
                                ((nm31) vm31Var).w.seekTo(((Long) ((List) obj2).get(0)).longValue());
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                g8 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 6:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getCurrentPosition()));
                            } catch (Throwable th7) {
                                g2 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                g = Collections.singletonList(Long.valueOf(((nm31) vm31Var).w.getBufferedPosition()));
                            } catch (Throwable th8) {
                                g = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        }
    }
}
