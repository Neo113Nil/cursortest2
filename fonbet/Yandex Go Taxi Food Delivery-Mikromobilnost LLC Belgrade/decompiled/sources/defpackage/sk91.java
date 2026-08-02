package defpackage;

import android.util.Log;
import android.util.Size;
import io.flutter.plugins.camerax.CameraXError;
import io.flutter.plugins.camerax.ResolutionStrategyFallbackRule;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public abstract class sk91 {
    public static final zg20[] a = new zg20[0];

    public static final boolean a(su30 su30Var) {
        List<hz30> list = su30Var.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (hz30 hz30Var : list) {
            if (!(hz30Var instanceof bs30) && !(hz30Var instanceof yi40) && !(hz30Var instanceof zi40) && !(hz30Var instanceof nk31)) {
                if (!(hz30Var instanceof gz30) && !(hz30Var instanceof l540) && !(hz30Var instanceof jm30) && !(hz30Var instanceof r440) && !(hz30Var instanceof lj40)) {
                    w511.b();
                }
                return false;
            }
        }
        return true;
    }

    public static final void b(ButtonComponent buttonComponent, boolean z) {
        if (z) {
            buttonComponent.setText(kyh0.common_done);
            buttonComponent.setButtonBackground(qje.t(xng0.controlMain, buttonComponent.getContext()));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            buttonComponent.setAccent(true);
            return;
        }
        buttonComponent.setText(kyh0.common_close);
        buttonComponent.setButtonBackground(qje.t(xng0.controlMinor, buttonComponent.getContext()));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
        buttonComponent.setAccent(false);
    }

    public static void c(tt5 tt5Var, final v83 v83Var) {
        rs10 j = v83Var != null ? v83Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.pigeon_defaultConstructor", j, obj);
        if (v83Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: wsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i2 = i;
                    int i3 = 4;
                    v83 v83Var2 = v83Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            Size size = (Size) list.get(1);
                            ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = (ResolutionStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = esj0.a[resolutionStrategyFallbackRule.ordinal()];
                                if (i4 == 1) {
                                    i3 = 2;
                                } else if (i4 == 2) {
                                    i3 = 1;
                                } else if (i4 != 3) {
                                    i3 = i4 != 4 ? i4 != 5 ? -1 : 0 : 3;
                                }
                                w4uVar.j(longValue, new csj0(i3, size));
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
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), csj0.c);
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
                            csj0 csj0Var = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(csj0Var.a);
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
                        default:
                            csj0 csj0Var2 = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i5 = csj0Var2.b;
                                g4 = Collections.singletonList(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? ResolutionStrategyFallbackRule.UNKNOWN : ResolutionStrategyFallbackRule.CLOSEST_LOWER : ResolutionStrategyFallbackRule.CLOSEST_LOWER_THEN_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER_THEN_LOWER : ResolutionStrategyFallbackRule.NONE);
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
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.highestAvailableStrategy", j, obj);
        if (v83Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: wsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i2;
                    int i3 = 4;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            Size size = (Size) list.get(1);
                            ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = (ResolutionStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = esj0.a[resolutionStrategyFallbackRule.ordinal()];
                                if (i4 == 1) {
                                    i3 = 2;
                                } else if (i4 == 2) {
                                    i3 = 1;
                                } else if (i4 != 3) {
                                    i3 = i4 != 4 ? i4 != 5 ? -1 : 0 : 3;
                                }
                                w4uVar.j(longValue, new csj0(i3, size));
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
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), csj0.c);
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
                            csj0 csj0Var = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(csj0Var.a);
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
                        default:
                            csj0 csj0Var2 = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i5 = csj0Var2.b;
                                g4 = Collections.singletonList(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? ResolutionStrategyFallbackRule.UNKNOWN : ResolutionStrategyFallbackRule.CLOSEST_LOWER : ResolutionStrategyFallbackRule.CLOSEST_LOWER_THEN_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER_THEN_LOWER : ResolutionStrategyFallbackRule.NONE);
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
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.getBoundSize", j, obj);
        if (v83Var != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: wsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i3;
                    int i32 = 4;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            Size size = (Size) list.get(1);
                            ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = (ResolutionStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i4 = esj0.a[resolutionStrategyFallbackRule.ordinal()];
                                if (i4 == 1) {
                                    i32 = 2;
                                } else if (i4 == 2) {
                                    i32 = 1;
                                } else if (i4 != 3) {
                                    i32 = i4 != 4 ? i4 != 5 ? -1 : 0 : 3;
                                }
                                w4uVar.j(longValue, new csj0(i32, size));
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
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), csj0.c);
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
                            csj0 csj0Var = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(csj0Var.a);
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
                        default:
                            csj0 csj0Var2 = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i5 = csj0Var2.b;
                                g4 = Collections.singletonList(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? ResolutionStrategyFallbackRule.UNKNOWN : ResolutionStrategyFallbackRule.CLOSEST_LOWER : ResolutionStrategyFallbackRule.CLOSEST_LOWER_THEN_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER_THEN_LOWER : ResolutionStrategyFallbackRule.NONE);
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
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.ResolutionStrategy.getFallbackRule", j, obj);
        if (v83Var == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: wsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    int i22 = i4;
                    int i32 = 4;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            long longValue = ((Long) list.get(0)).longValue();
                            Size size = (Size) list.get(1);
                            ResolutionStrategyFallbackRule resolutionStrategyFallbackRule = (ResolutionStrategyFallbackRule) list.get(2);
                            try {
                                w4u w4uVar = (w4u) v83Var2.a.w;
                                int i42 = esj0.a[resolutionStrategyFallbackRule.ordinal()];
                                if (i42 == 1) {
                                    i32 = 2;
                                } else if (i42 == 2) {
                                    i32 = 1;
                                } else if (i42 != 3) {
                                    i32 = i42 != 4 ? i42 != 5 ? -1 : 0 : 3;
                                }
                                w4uVar.j(longValue, new csj0(i32, size));
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
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), csj0.c);
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
                            csj0 csj0Var = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                g3 = Collections.singletonList(csj0Var.a);
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
                        default:
                            csj0 csj0Var2 = (csj0) ((List) obj2).get(0);
                            try {
                                v83Var2.getClass();
                                int i5 = csj0Var2.b;
                                g4 = Collections.singletonList(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? ResolutionStrategyFallbackRule.UNKNOWN : ResolutionStrategyFallbackRule.CLOSEST_LOWER : ResolutionStrategyFallbackRule.CLOSEST_LOWER_THEN_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER : ResolutionStrategyFallbackRule.CLOSEST_HIGHER_THEN_LOWER : ResolutionStrategyFallbackRule.NONE);
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
                    }
                }
            });
        }
    }
}
