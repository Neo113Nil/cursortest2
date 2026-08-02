package defpackage;

import io.flutter.plugins.camerax.CameraXError;
import java.util.List;
import kotlin.Result;

/* loaded from: classes4.dex */
public final /* synthetic */ class trb0 implements fe5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv40 b;

    public /* synthetic */ trb0(gv40 gv40Var, int i) {
        this.a = i;
        this.b = gv40Var;
    }

    @Override // defpackage.fe5
    public final void a(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        gv40 gv40Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof List)) {
                    n.D(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Analyzer.analyze'.", "")), gv40Var);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        gv40Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        n.D(new Result.Failure(new CameraXError((String) list.get(0), (String) list.get(1), (String) list.get(2))), gv40Var);
                        break;
                    }
                }
            case 1:
                if (!(obj instanceof List)) {
                    n.D(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.onDeviceOrientationChanged'.", "")), gv40Var);
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        gv40Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        n.D(new Result.Failure(new CameraXError((String) list2.get(0), (String) list2.get(1), (String) list2.get(2))), gv40Var);
                        break;
                    }
                }
            case 2:
                if (!(obj instanceof List)) {
                    n.D(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.Observer.onChanged'.", "")), gv40Var);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        gv40Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        n.D(new Result.Failure(new CameraXError((String) list3.get(0), (String) list3.get(1), (String) list3.get(2))), gv40Var);
                        break;
                    }
                }
            case 3:
                if (!(obj instanceof List)) {
                    n.D(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.onCameraError'.", "")), gv40Var);
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        gv40Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        n.D(new Result.Failure(new CameraXError((String) list4.get(0), (String) list4.get(1), (String) list4.get(2))), gv40Var);
                        break;
                    }
                }
            default:
                if (!(obj instanceof List)) {
                    n.D(new Result.Failure(new CameraXError("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.camera_android_camerax.VideoRecordEventListener.onEvent'.", "")), gv40Var);
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        gv40Var.invoke(new Result(zy11Var));
                        break;
                    } else {
                        n.D(new Result.Failure(new CameraXError((String) list5.get(0), (String) list5.get(1), (String) list5.get(2))), gv40Var);
                        break;
                    }
                }
        }
    }
}
