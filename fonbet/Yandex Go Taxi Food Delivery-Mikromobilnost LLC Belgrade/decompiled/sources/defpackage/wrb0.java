package defpackage;

import android.util.Log;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Collections;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class wrb0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce5 b;

    public /* synthetic */ wrb0(ce5 ce5Var, int i) {
        this.a = i;
        this.b = ce5Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List g;
        List g2;
        List g3;
        List g4;
        List g5;
        List g6;
        List g7;
        List g8;
        List g9;
        List g10;
        List g11;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ce5 ce5Var = this.b;
        Result result = (Result) obj;
        switch (i) {
            case 0:
                Throwable a = Result.a(result.getValue());
                if (a == null) {
                    ce5Var.a(Collections.singletonList(null));
                    break;
                } else {
                    if (a instanceof CameraXError) {
                        CameraXError cameraXError = (CameraXError) a;
                        g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                    } else {
                        g = scc.g(a.getClass().getSimpleName(), a.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a), a.getCause()));
                    }
                    ce5Var.a(g);
                    break;
                }
            case 1:
                Throwable a2 = Result.a(result.getValue());
                if (a2 == null) {
                    ce5Var.a(Collections.singletonList(null));
                    break;
                } else {
                    if (a2 instanceof CameraXError) {
                        CameraXError cameraXError2 = (CameraXError) a2;
                        g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                    } else {
                        g2 = scc.g(a2.getClass().getSimpleName(), a2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a2), a2.getCause()));
                    }
                    ce5Var.a(g2);
                    break;
                }
            case 2:
                Throwable a3 = Result.a(result.getValue());
                if (a3 == null) {
                    Object value = result.getValue();
                    ce5Var.a(Collections.singletonList((Long) (value instanceof Result.Failure ? null : value)));
                    break;
                } else {
                    if (a3 instanceof CameraXError) {
                        CameraXError cameraXError3 = (CameraXError) a3;
                        g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                    } else {
                        g3 = scc.g(a3.getClass().getSimpleName(), a3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a3), a3.getCause()));
                    }
                    ce5Var.a(g3);
                    break;
                }
            case 3:
                Throwable a4 = Result.a(result.getValue());
                if (a4 == null) {
                    ce5Var.a(Collections.singletonList(null));
                    break;
                } else {
                    if (a4 instanceof CameraXError) {
                        CameraXError cameraXError4 = (CameraXError) a4;
                        g4 = scc.g(cameraXError4.getCode(), cameraXError4.getMessage(), cameraXError4.getDetails());
                    } else {
                        g4 = scc.g(a4.getClass().getSimpleName(), a4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a4), a4.getCause()));
                    }
                    ce5Var.a(g4);
                    break;
                }
            case 4:
                Throwable a5 = Result.a(result.getValue());
                if (a5 == null) {
                    ce5Var.a(Collections.singletonList(null));
                    break;
                } else {
                    if (a5 instanceof CameraXError) {
                        CameraXError cameraXError5 = (CameraXError) a5;
                        g5 = scc.g(cameraXError5.getCode(), cameraXError5.getMessage(), cameraXError5.getDetails());
                    } else {
                        g5 = scc.g(a5.getClass().getSimpleName(), a5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a5), a5.getCause()));
                    }
                    ce5Var.a(g5);
                    break;
                }
            case 5:
                Throwable a6 = Result.a(result.getValue());
                if (a6 == null) {
                    Object value2 = result.getValue();
                    ce5Var.a(Collections.singletonList((nur) (value2 instanceof Result.Failure ? null : value2)));
                    break;
                } else {
                    if (a6 instanceof CameraXError) {
                        CameraXError cameraXError6 = (CameraXError) a6;
                        g6 = scc.g(cameraXError6.getCode(), cameraXError6.getMessage(), cameraXError6.getDetails());
                    } else {
                        g6 = scc.g(a6.getClass().getSimpleName(), a6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a6), a6.getCause()));
                    }
                    ce5Var.a(g6);
                    break;
                }
            case 6:
                Throwable a7 = Result.a(result.getValue());
                if (a7 == null) {
                    Object value3 = result.getValue();
                    ce5Var.a(Collections.singletonList((Boolean) (value3 instanceof Result.Failure ? null : value3)));
                    break;
                } else {
                    if (a7 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError = (AndroidWebKitError) a7;
                        g7 = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                    } else {
                        g7 = scc.g(a7.getClass().getSimpleName(), a7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a7), a7.getCause()));
                    }
                    ce5Var.a(g7);
                    break;
                }
            case 7:
                Throwable a8 = Result.a(result.getValue());
                if (a8 == null) {
                    Object value4 = result.getValue();
                    ce5Var.a(Collections.singletonList((String) (value4 instanceof Result.Failure ? null : value4)));
                    break;
                } else {
                    if (a8 instanceof CameraXError) {
                        CameraXError cameraXError7 = (CameraXError) a8;
                        g8 = scc.g(cameraXError7.getCode(), cameraXError7.getMessage(), cameraXError7.getDetails());
                    } else {
                        g8 = scc.g(a8.getClass().getSimpleName(), a8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a8), a8.getCause()));
                    }
                    ce5Var.a(g8);
                    break;
                }
            case 8:
                Throwable a9 = Result.a(result.getValue());
                if (a9 == null) {
                    Object value5 = result.getValue();
                    ce5Var.a(Collections.singletonList((i5f0) (value5 instanceof Result.Failure ? null : value5)));
                    break;
                } else {
                    if (a9 instanceof CameraXError) {
                        CameraXError cameraXError8 = (CameraXError) a9;
                        g9 = scc.g(cameraXError8.getCode(), cameraXError8.getMessage(), cameraXError8.getDetails());
                    } else {
                        g9 = scc.g(a9.getClass().getSimpleName(), a9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a9), a9.getCause()));
                    }
                    ce5Var.a(g9);
                    break;
                }
            case 9:
                Throwable a10 = Result.a(result.getValue());
                if (a10 == null) {
                    Object value6 = result.getValue();
                    ce5Var.a(Collections.singletonList((as7) (value6 instanceof Result.Failure ? null : value6)));
                    break;
                } else {
                    if (a10 instanceof CameraXError) {
                        CameraXError cameraXError9 = (CameraXError) a10;
                        g10 = scc.g(cameraXError9.getCode(), cameraXError9.getMessage(), cameraXError9.getDetails());
                    } else {
                        g10 = scc.g(a10.getClass().getSimpleName(), a10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a10), a10.getCause()));
                    }
                    ce5Var.a(g10);
                    break;
                }
            default:
                Throwable a11 = Result.a(result.getValue());
                if (a11 == null) {
                    Object value7 = result.getValue();
                    ce5Var.a(Collections.singletonList((String) (value7 instanceof Result.Failure ? null : value7)));
                    break;
                } else {
                    if (a11 instanceof AndroidWebKitError) {
                        AndroidWebKitError androidWebKitError2 = (AndroidWebKitError) a11;
                        g11 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                    } else {
                        g11 = scc.g(a11.getClass().getSimpleName(), a11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(a11), a11.getCause()));
                    }
                    ce5Var.a(g11);
                    break;
                }
        }
        return zy11Var;
    }
}
