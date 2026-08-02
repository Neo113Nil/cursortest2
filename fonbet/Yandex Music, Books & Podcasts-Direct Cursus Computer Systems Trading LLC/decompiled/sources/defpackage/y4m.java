package defpackage;

import com.connectsdk.service.command.ServiceCommand;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class y4m {
    public static final /* synthetic */ y4m[] a = {new y4m(ServiceCommand.TYPE_GET, 0), new y4m(ServiceCommand.TYPE_POST, 1), new y4m(ServiceCommand.TYPE_PUT, 2), new y4m("PATCH", 3), new y4m(ServiceCommand.TYPE_DEL, 4)};

    /* JADX INFO: Fake field, exist only in values array */
    y4m EF5;

    public static y4m valueOf(String str) {
        return (y4m) Enum.valueOf(y4m.class, str);
    }

    public static y4m[] values() {
        return (y4m[]) a.clone();
    }
}
