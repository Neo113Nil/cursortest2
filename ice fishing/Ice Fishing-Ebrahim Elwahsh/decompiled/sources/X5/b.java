package X5;

/* loaded from: classes2.dex */
public interface b extends e {
    void addObserver(c cVar);

    @Override // X5.e
    /* synthetic */ String getId();

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(c cVar);
}
