package defpackage;

import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.gestures.Orientation;
import androidx.media3.common.ParserException;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.MeteringMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class xj91 {
    public static mgv a;

    public static int[] a(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static final f530 b(f530 f530Var, hgx hgxVar, e6y e6yVar, Orientation orientation, boolean z) {
        return f530Var.k(new h6y(hgxVar, e6yVar, orientation, z));
    }

    public static w820 c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = tw21.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                lk91.j("Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(grb0.a(new ef90(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    lk91.k("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new sz31(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new w820(arrayList);
    }

    public static eg01 d(ef90 ef90Var, boolean z, boolean z2) {
        if (z) {
            f(3, ef90Var, false);
        }
        ef90Var.w((int) ef90Var.p(), StandardCharsets.UTF_8);
        long p = ef90Var.p();
        String[] strArr = new String[(int) p];
        for (int i = 0; i < p; i++) {
            strArr[i] = ef90Var.w((int) ef90Var.p(), StandardCharsets.UTF_8);
        }
        if (z2 && (ef90Var.y() & 1) == 0) {
            throw ParserException.a(null, "framing bit expected to be set");
        }
        return new eg01(strArr);
    }

    public static void e(tt5 tt5Var, final sm7 sm7Var) {
        rs10 j = sm7Var != null ? sm7Var.a.j() : new bu7();
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.pigeon_defaultConstructor", j, null);
        if (sm7Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i2 = i;
                    sm7 sm7Var2 = sm7Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.withMode", j, null);
        if (sm7Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i2;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.addPoint", j, null);
        if (sm7Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i3;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.addPointWithMode", j, null);
        if (sm7Var != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i4;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.disableAutoCancel", j, null);
        if (sm7Var != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i5;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.FocusMeteringActionBuilder.build", j, null);
        if (sm7Var == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: ksb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i6;
                    sm7 sm7Var2 = sm7Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list.get(0)).longValue(), new eur((s920) list.get(1), 7));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                ((w4u) sm7Var2.a.w).j(((Long) list2.get(0)).longValue(), new eur((s920) list2.get(1), sm7.a((MeteringMode) list2.get(2))));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            eur eurVar = (eur) list3.get(0);
                            s920 s920Var = (s920) list3.get(1);
                            try {
                                sm7Var2.getClass();
                                eurVar.a(s920Var, 7);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            eur eurVar2 = (eur) list4.get(0);
                            s920 s920Var2 = (s920) list4.get(1);
                            MeteringMode meteringMode = (MeteringMode) list4.get(2);
                            try {
                                sm7Var2.getClass();
                                eurVar2.a(s920Var2, sm7.a(meteringMode));
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof CameraXError) {
                                    CameraXError cameraXError4 = th4;
                                    g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            eur eurVar3 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                eurVar3.d = 0L;
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof CameraXError) {
                                    CameraXError cameraXError5 = th5;
                                    g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            eur eurVar4 = (eur) ((List) obj).get(0);
                            try {
                                sm7Var2.getClass();
                                g6 = Collections.singletonList(new fur(eurVar4));
                            } catch (Throwable th6) {
                                if (th6 instanceof CameraXError) {
                                    CameraXError cameraXError6 = th6;
                                    g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        }
    }

    public static boolean f(int i, ef90 ef90Var, boolean z) {
        if (ef90Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "too short header: " + ef90Var.a());
        }
        if (ef90Var.y() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a(null, "expected header type " + Integer.toHexString(i));
        }
        if (ef90Var.y() == 118 && ef90Var.y() == 111 && ef90Var.y() == 114 && ef90Var.y() == 98 && ef90Var.y() == 105 && ef90Var.y() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a(null, "expected characters 'vorbis'");
    }
}
