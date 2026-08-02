package defpackage;

import com.connectsdk.service.command.ServiceCommand;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z6e {
    public static final z6e a;
    public static final z6e b;
    public static final /* synthetic */ z6e[] c;

    static {
        z6e z6eVar = new z6e(ServiceCommand.TYPE_GET, 0);
        a = z6eVar;
        z6e z6eVar2 = new z6e(ServiceCommand.TYPE_POST, 1);
        b = z6eVar2;
        c = new z6e[]{z6eVar, z6eVar2, new z6e(ServiceCommand.TYPE_DEL, 2)};
    }

    public static z6e valueOf(String str) {
        return (z6e) Enum.valueOf(z6e.class, str);
    }

    public static z6e[] values() {
        return (z6e[]) c.clone();
    }
}
