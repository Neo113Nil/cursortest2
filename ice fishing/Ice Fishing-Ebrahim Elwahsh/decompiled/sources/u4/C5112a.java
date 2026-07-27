package u4;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5112a {
    private final String apiKey;
    private final String appId;
    private final String projectId;

    public C5112a() {
        this(null, null, null, 7, null);
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public C5112a(String str, String str2, String str3) {
        this.projectId = str;
        this.appId = str2;
        this.apiKey = str3;
    }

    public /* synthetic */ C5112a(String str, String str2, String str3, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
