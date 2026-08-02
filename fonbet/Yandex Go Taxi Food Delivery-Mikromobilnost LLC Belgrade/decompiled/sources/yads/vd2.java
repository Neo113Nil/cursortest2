package yads;

import defpackage.k4o;
import defpackage.scc;
import java.util.Collections;
import java.util.List;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class vd2 {
    public static final /* synthetic */ vd2[] c;
    public static final /* synthetic */ k4o d;
    public final List b;

    static {
        vd2[] vd2VarArr = {new vd2(0, "Flutter", Collections.singletonList("io.flutter.embedding.android.FlutterActivity")), new vd2(1, "ReactNative", Collections.singletonList("com.facebook.react.bridge.ReactContext")), new vd2(2, "Unity", scc.g("com.unity3d.player.UnityPlayer", "com.unity3d.player.UnityPlayerActivity"))};
        c = vd2VarArr;
        d = a.a(vd2VarArr);
    }

    public vd2(int i, String str, List list) {
        this.b = list;
    }

    public static vd2 valueOf(String str) {
        return (vd2) Enum.valueOf(vd2.class, str);
    }

    public static vd2[] values() {
        return (vd2[]) c.clone();
    }
}
