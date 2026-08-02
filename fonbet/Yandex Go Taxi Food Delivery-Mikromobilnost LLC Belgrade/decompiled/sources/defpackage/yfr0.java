package defpackage;

import android.opengl.GLES20;
import android.opengl.GLException;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Shader$BlendFactor;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class yfr0 implements Closeable {
    public static final /* synthetic */ int F = 0;
    public Shader$BlendFactor B;
    public Shader$BlendFactor C;
    public Shader$BlendFactor D;
    public Shader$BlendFactor E;
    public int a;
    public int c;
    public final HashMap b = new HashMap();
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public boolean y = true;
    public boolean z = true;
    public final boolean A = true;

    public yfr0(String str, String str2, Map map) {
        String sb;
        int i;
        Shader$BlendFactor shader$BlendFactor = Shader$BlendFactor.ONE;
        this.B = shader$BlendFactor;
        Shader$BlendFactor shader$BlendFactor2 = Shader$BlendFactor.ZERO;
        this.C = shader$BlendFactor2;
        this.D = shader$BlendFactor;
        this.E = shader$BlendFactor2;
        if (map == null) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                sb2.append("#define " + entry.getKey() + " " + entry.getValue() + "\n");
            }
            sb = sb2.toString();
        }
        int i2 = 0;
        try {
            int z = r100.z(35633, r100.A(str, sb));
            try {
                i = r100.z(35632, r100.A(str2, sb));
                try {
                    this.a = GLES20.glCreateProgram();
                    pva1.i("Shader program creation failed", "glCreateProgram");
                    GLES20.glAttachShader(this.a, z);
                    pva1.i("Failed to attach vertex shader", "glAttachShader");
                    GLES20.glAttachShader(this.a, i);
                    pva1.i("Failed to attach fragment shader", "glAttachShader");
                    GLES20.glLinkProgram(this.a);
                    pva1.i("Failed to link shader program", "glLinkProgram");
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.a);
                        pva1.h("yfr0", "Failed to retrieve shader program info log", "glGetProgramInfoLog");
                        throw new GLException(0, "Shader link failed: " + glGetProgramInfoLog);
                    }
                    if (z != 0) {
                        GLES20.glDeleteShader(z);
                        pva1.h("yfr0", "Failed to free vertex shader", "glDeleteShader");
                    }
                    if (i != 0) {
                        GLES20.glDeleteShader(i);
                        pva1.h("yfr0", "Failed to free fragment shader", "glDeleteShader");
                    }
                } catch (Throwable th) {
                    th = th;
                    i2 = z;
                    try {
                        close();
                        throw th;
                    } catch (Throwable th2) {
                        if (i2 != 0) {
                            GLES20.glDeleteShader(i2);
                            pva1.h("yfr0", "Failed to free vertex shader", "glDeleteShader");
                        }
                        if (i != 0) {
                            GLES20.glDeleteShader(i);
                            pva1.h("yfr0", "Failed to free fragment shader", "glDeleteShader");
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                i = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            i = 0;
        }
    }

    public final int a(String str) {
        ArrayList arrayList;
        Integer num;
        HashMap hashMap = this.w;
        Integer num2 = (Integer) hashMap.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(glGetError));
            while (true) {
                int glGetError2 = GLES20.glGetError();
                if (glGetError2 == 0) {
                    break;
                }
                arrayList2.add(Integer.valueOf(glGetError2));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && (num = (Integer) arrayList.get(0)) != null) {
            throw new GLException(num.intValue(), pva1.f("Failed to find uniform", "glGetUniformLocation", arrayList));
        }
        if (glGetUniformLocation == -1) {
            w511.f("Shader uniform does not exist: ".concat(str));
            return 0;
        }
        hashMap.put(str, Integer.valueOf(glGetUniformLocation));
        this.x.put(Integer.valueOf(glGetUniformLocation), str);
        return glGetUniformLocation;
    }

    public final void c(float f, String str) {
        this.b.put(Integer.valueOf(a(str)), new vfr0(0, new float[]{f}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.a = 0;
        }
    }

    public final void d(float[] fArr) {
        if (fArr.length != 4) {
            ny61.g("Value array length must be 4 (2x2)");
            return;
        }
        this.b.put(Integer.valueOf(a("u_PlaneUvMatrix")), new vfr0(3, (float[]) fArr.clone()));
    }

    public final void e(String str, float[] fArr) {
        if (fArr.length != 16) {
            ny61.g("Value array length must be 16 (4x4)");
            return;
        }
        this.b.put(Integer.valueOf(a(str)), new vfr0(4, (float[]) fArr.clone()));
    }

    public final void k(String str, uxj uxjVar) {
        int i;
        int a = a(str);
        Integer valueOf = Integer.valueOf(a);
        HashMap hashMap = this.b;
        wfr0 wfr0Var = (wfr0) hashMap.get(valueOf);
        if (wfr0Var instanceof xfr0) {
            i = ((xfr0) wfr0Var).a;
        } else {
            i = this.c;
            this.c = i + 1;
        }
        hashMap.put(Integer.valueOf(a), new xfr0(i, uxjVar));
    }

    public final void n(String str, float[] fArr) {
        if (fArr.length != 3) {
            ny61.g("Value array length must be 3");
            return;
        }
        this.b.put(Integer.valueOf(a(str)), new vfr0(1, (float[]) fArr.clone()));
    }

    public final void o(String str, float[] fArr) {
        if (fArr.length != 4) {
            ny61.g("Value array length must be 4");
            return;
        }
        this.b.put(Integer.valueOf(a(str)), new vfr0(2, (float[]) fArr.clone()));
    }
}
