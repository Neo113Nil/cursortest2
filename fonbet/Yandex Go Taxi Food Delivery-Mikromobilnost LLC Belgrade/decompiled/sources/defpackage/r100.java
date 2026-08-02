package defpackage;

import android.content.res.AssetManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.os.Handler;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$BackDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.collections.b;
import kotlin.text.Regex;

/* loaded from: classes7.dex */
public final class r100 implements wi00, cd10, k120, ekb0, s8i0, llt0, hq31, jg51 {
    public r100() {
        new Handler();
    }

    public static final String A(String str, String str2) {
        String j = new Regex("(?m)^(\\s*#\\s*version\\s+.*)$").j(str, "$1\n" + Matcher.quoteReplacement(str2));
        return j.equals(str) ? str2.concat(str) : j;
    }

    public static final void B(fw60 fw60Var, String str) {
        fw60Var.a("Failed to decode body. ".concat(str));
    }

    public static m2v C(gkn0 gkn0Var, ScootersErrorDialogPresentation$BackDialogButtonListenerType scootersErrorDialogPresentation$BackDialogButtonListenerType, int i) {
        if ((i & 8) != 0) {
            scootersErrorDialogPresentation$BackDialogButtonListenerType = ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT;
        }
        Object obj = null;
        return new m2v(gkn0Var, obj, obj, scootersErrorDialogPresentation$BackDialogButtonListenerType);
    }

    public static yfr0 D(wyl0 wyl0Var, String str, String str2, Map map) {
        AssetManager assetManager = wyl0Var.a;
        return new yfr0(F(assetManager != null ? assetManager.open(str) : null), F(assetManager != null ? assetManager.open(str2) : null), map);
    }

    public static m2v E(gkn0 gkn0Var, ScootersErrorDialogPresentation$RetryDialogButtonListenerType scootersErrorDialogPresentation$RetryDialogButtonListenerType, int i) {
        if ((i & 8) != 0) {
            scootersErrorDialogPresentation$RetryDialogButtonListenerType = ScootersErrorDialogPresentation$RetryDialogButtonListenerType.DEFAULT;
        }
        Object obj = null;
        return new m2v(gkn0Var, obj, obj, scootersErrorDialogPresentation$RetryDialogButtonListenerType);
    }

    public static String F(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8.name());
        char[] cArr = new char[4096];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                inputStreamReader.close();
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int z(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        pva1.i("Shader creation failed", "glCreateShader");
        GLES20.glShaderSource(glCreateShader, str);
        pva1.i("Shader source failed", "glShaderSource");
        GLES20.glCompileShader(glCreateShader);
        pva1.i("Shader compilation failed", "glCompileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        pva1.h("yfr0", "Failed to retrieve shader info log", "glGetShaderInfoLog");
        GLES20.glDeleteShader(glCreateShader);
        pva1.h("yfr0", "Failed to free shader", "glDeleteShader");
        throw new GLException(0, g8e.o("Shader compilation failed: ", glGetShaderInfoLog));
    }

    public boolean G(Object obj, File file, File file2) {
        return true;
    }

    @Override // defpackage.hq31
    public Map a() {
        return b.f();
    }

    @Override // defpackage.ekb0
    public void b(int i) {
    }

    @Override // defpackage.s8i0
    public void c(String str, boolean z) {
    }

    @Override // defpackage.llt0
    public Object d(String str) {
        return new Object();
    }

    @Override // defpackage.hq31
    public float e() {
        return 0.0f;
    }

    @Override // defpackage.llt0
    public Object f(String str) {
        return new Object();
    }

    @Override // defpackage.cd10
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // defpackage.ekb0
    public void h(int i) {
    }

    @Override // defpackage.ekb0
    public void i(int i) {
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object j() {
        return "f9625d73-62f8-4a23-9226-cd733c910cee";
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object k() {
        return null;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object l() {
        return null;
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object m() {
        return null;
    }

    @Override // defpackage.cd10
    public MediaCodecInfo n(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object o() {
        return "051fbc85-9aaa-4c9a-96bc-518c354891e3";
    }

    @Override // defpackage.jg51
    public void p(lg51 lg51Var) {
    }

    @Override // defpackage.cd10
    public boolean q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // defpackage.jg51
    public void r(i4u i4uVar) {
    }

    @Override // defpackage.k120
    public /* bridge */ /* synthetic */ Object s() {
        return null;
    }

    @Override // defpackage.cd10
    public int t() {
        return MediaCodecList.getCodecCount();
    }

    @Override // defpackage.hq31
    public float u() {
        return 0.0f;
    }

    @Override // defpackage.ekb0
    public void w() {
    }

    @Override // defpackage.llt0
    public Object x(Uri uri, boolean z) {
        return new Object();
    }

    @Override // defpackage.cd10
    public boolean y() {
        return false;
    }

    public r100(b00 b00Var) {
    }

    public /* synthetic */ r100(boolean z) {
    }
}
