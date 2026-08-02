package com.miteksystems.misnap.controller.a;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class x implements z {
    public int a;

    public abstract /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(3).length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[CameraSelector$$ExternalSyntheticOutline0.values(5).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public final UserAction a(Frame frame, MiSnapFaceAnalyzer.Result.Processed processed) {
        int i;
        frame.getClass();
        int a = a(processed);
        int i2 = this.a;
        int[] iArr = c.a;
        int i3 = iArr[CameraSelector$$ExternalSyntheticOutline0.ordinal(i2)];
        if (i3 == 1) {
            int i4 = iArr[CameraSelector$$ExternalSyntheticOutline0.ordinal(a)];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = 3;
                }
                i = 4;
            }
            i = 5;
        } else if (i3 == 2) {
            int i5 = iArr[CameraSelector$$ExternalSyntheticOutline0.ordinal(a)];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = 1;
                }
                i = 4;
            }
            i = 5;
        } else {
            if (i3 != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            int i6 = iArr[CameraSelector$$ExternalSyntheticOutline0.ordinal(a)];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i = 3;
                } else {
                    i = 2;
                }
            }
            i = 5;
        }
        this.a = a;
        int i7 = c.b[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
        return (i7 == 1 || i7 == 2) ? UserAction.Face.STOP_SMILE.INSTANCE : i7 != 3 ? UserAction.NONE.INSTANCE : UserAction.Face.SMILE.INSTANCE;
    }

    public static int a(MiSnapFaceAnalyzer.Result.Processed processed) {
        return processed.getPassedFaceChecks().contains(MiSnapFaceAnalyzer.Result.Processed.FaceCheck.IS_SMILING) ? 2 : 3;
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public final /* synthetic */ void a() {
        this.a = 1;
    }
}
