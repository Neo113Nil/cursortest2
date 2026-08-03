package qb;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface b extends e {
    void addObserver(c cVar);

    @Override // qb.e
    /* synthetic */ String getId();

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(c cVar);
}
