package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mq {
    public static final /* synthetic */ defpackage.mq[] P05cfTpS5W5L;
    public static final defpackage.mq QiMR8OkAhezm;
    public static final defpackage.mq WDYagTQQm9ns;
    public static final defpackage.mq oh71FJcDz6S2;

    static {
        defpackage.mq mqVar = new defpackage.mq("Vertical", 0);
        WDYagTQQm9ns = mqVar;
        defpackage.mq mqVar2 = new defpackage.mq("Horizontal", 1);
        oh71FJcDz6S2 = mqVar2;
        defpackage.mq mqVar3 = new defpackage.mq("Both", 2);
        QiMR8OkAhezm = mqVar3;
        P05cfTpS5W5L = new defpackage.mq[]{mqVar, mqVar2, mqVar3};
    }

    public static defpackage.mq valueOf(java.lang.String str) {
        return (defpackage.mq) java.lang.Enum.valueOf(defpackage.mq.class, str);
    }

    public static defpackage.mq[] values() {
        return (defpackage.mq[]) P05cfTpS5W5L.clone();
    }
}
