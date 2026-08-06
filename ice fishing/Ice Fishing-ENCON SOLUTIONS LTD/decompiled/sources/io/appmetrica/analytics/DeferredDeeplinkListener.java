package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a, reason: collision with root package name */
        private final String f3463a;

        Error(String str) {
            this.f3463a = str;
        }

        public String getDescription() {
            return this.f3463a;
        }
    }

    void onDeeplinkLoaded(String str);

    void onError(Error error, String str);
}
