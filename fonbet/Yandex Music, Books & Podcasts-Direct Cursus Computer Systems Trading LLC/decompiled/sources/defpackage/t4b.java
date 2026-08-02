package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t4b implements x8n {
    public static final t4b a;
    public static final /* synthetic */ t4b[] b;

    static {
        t4b t4bVar = new t4b("INSTANCE", 0);
        a = t4bVar;
        b = new t4b[]{t4bVar, new t4b("NEVER", 1)};
    }

    public static t4b valueOf(String str) {
        return (t4b) Enum.valueOf(t4b.class, str);
    }

    public static t4b[] values() {
        return (t4b[]) b.clone();
    }

    @Override // defpackage.x8n
    public final int c() {
        return 2;
    }

    @Override // defpackage.qjq
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.qjq
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qjq
    public final Object poll() {
        return null;
    }

    @Override // defpackage.ka8
    public final void a() {
    }

    @Override // defpackage.qjq
    public final void clear() {
    }
}
