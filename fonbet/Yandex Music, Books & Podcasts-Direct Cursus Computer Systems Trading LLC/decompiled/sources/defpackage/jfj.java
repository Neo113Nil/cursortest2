package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class jfj {
    public static final jfj a;
    public static final /* synthetic */ jfj[] b;

    static {
        jfj jfjVar = new jfj("COMPLETE", 0);
        a = jfjVar;
        b = new jfj[]{jfjVar};
    }

    public static boolean a(wjj wjjVar, Object obj) {
        if (obj == a) {
            wjjVar.onComplete();
            return true;
        }
        if (obj instanceof ifj) {
            wjjVar.onError(((ifj) obj).a);
            return true;
        }
        wjjVar.onNext(obj);
        return false;
    }

    public static jfj valueOf(String str) {
        return (jfj) Enum.valueOf(jfj.class, str);
    }

    public static jfj[] values() {
        return (jfj[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
