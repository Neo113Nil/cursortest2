package defpackage;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class vfr0 implements wfr0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vfr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wfr0
    public final void a(int i) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        int i2 = this.a;
        ArrayList arrayList = null;
        Object obj = this.b;
        switch (i2) {
            case 0:
                GLES20.glUniform1fv(i, 1, (float[]) obj, 0);
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(glGetError));
                    while (true) {
                        int glGetError2 = GLES20.glGetError();
                        if (glGetError2 != 0) {
                            arrayList.add(Integer.valueOf(glGetError2));
                        }
                    }
                }
                if (arrayList != null && (num = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num.intValue(), pva1.f("Failed to set shader uniform 1f", "glUniform1fv", arrayList));
                }
                return;
            case 1:
                float[] fArr = (float[]) obj;
                GLES20.glUniform3fv(i, fArr.length / 3, fArr, 0);
                int glGetError3 = GLES20.glGetError();
                if (glGetError3 != 0) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(glGetError3));
                    while (true) {
                        int glGetError4 = GLES20.glGetError();
                        if (glGetError4 == 0) {
                            arrayList = arrayList2;
                        } else {
                            arrayList2.add(Integer.valueOf(glGetError4));
                        }
                    }
                }
                if (arrayList != null && (num2 = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num2.intValue(), pva1.f("Failed to set shader uniform 3f", "glUniform3fv", arrayList));
                }
                return;
            case 2:
                float[] fArr2 = (float[]) obj;
                GLES20.glUniform4fv(i, fArr2.length / 4, fArr2, 0);
                int glGetError5 = GLES20.glGetError();
                if (glGetError5 != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Integer.valueOf(glGetError5));
                    while (true) {
                        int glGetError6 = GLES20.glGetError();
                        if (glGetError6 == 0) {
                            arrayList = arrayList3;
                        } else {
                            arrayList3.add(Integer.valueOf(glGetError6));
                        }
                    }
                }
                if (arrayList != null && (num3 = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num3.intValue(), pva1.f("Failed to set shader uniform 4f", "glUniform4fv", arrayList));
                }
                return;
            case 3:
                float[] fArr3 = (float[]) obj;
                GLES20.glUniformMatrix2fv(i, fArr3.length / 4, false, fArr3, 0);
                int glGetError7 = GLES20.glGetError();
                if (glGetError7 != 0) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(Integer.valueOf(glGetError7));
                    while (true) {
                        int glGetError8 = GLES20.glGetError();
                        if (glGetError8 == 0) {
                            arrayList = arrayList4;
                        } else {
                            arrayList4.add(Integer.valueOf(glGetError8));
                        }
                    }
                }
                if (arrayList != null && (num4 = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num4.intValue(), pva1.f("Failed to set shader uniform matrix 2f", "glUniformMatrix2fv", arrayList));
                }
                return;
            case 4:
                float[] fArr4 = (float[]) obj;
                GLES20.glUniformMatrix4fv(i, fArr4.length / 16, false, fArr4, 0);
                int glGetError9 = GLES20.glGetError();
                if (glGetError9 != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(Integer.valueOf(glGetError9));
                    while (true) {
                        int glGetError10 = GLES20.glGetError();
                        if (glGetError10 == 0) {
                            arrayList = arrayList5;
                        } else {
                            arrayList5.add(Integer.valueOf(glGetError10));
                        }
                    }
                }
                if (arrayList != null && (num5 = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num5.intValue(), pva1.f("Failed to set shader uniform matrix 4f", "glUniformMatrix4fv", arrayList));
                }
                return;
            default:
                GLES20.glUniform1iv(i, 1, (int[]) obj, 0);
                int glGetError11 = GLES20.glGetError();
                if (glGetError11 != 0) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(Integer.valueOf(glGetError11));
                    while (true) {
                        int glGetError12 = GLES20.glGetError();
                        if (glGetError12 == 0) {
                            arrayList = arrayList6;
                        } else {
                            arrayList6.add(Integer.valueOf(glGetError12));
                        }
                    }
                }
                if (arrayList != null && (num6 = (Integer) arrayList.get(0)) != null) {
                    throw new GLException(num6.intValue(), pva1.f("Failed to set shader uniform 1i", "glUniform1iv", arrayList));
                }
                return;
        }
    }
}
