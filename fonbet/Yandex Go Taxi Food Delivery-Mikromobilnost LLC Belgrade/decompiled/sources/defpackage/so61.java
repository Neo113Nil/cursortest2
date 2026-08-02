package defpackage;

/* loaded from: classes7.dex */
public abstract class so61 {
    public static final dl61 a = a(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.");
    public static final dl61 b = a(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.");
    public static final dl61 c = a(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.");
    public static final dl61 d = a(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.");
    public static final dl61 e = a(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.");
    public static final dl61 f = a(1, "Invalid SDK state.", "Invalid SDK state.");
    public static final dl61 g = a(1, "Invalid SDK state.", "Invalid SDK state.");
    public static final dl61 h = a(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.");
    public static final dl61 i = a(2, "Ad request configured incorrectly", "Ad request configured incorrectly");
    public static final dl61 j = a(2, "Invalid request parameters", "Invalid request parameters");
    public static final dl61 k = a(2, "Invalid ad type in response", "Invalid ad type in response");
    public static final dl61 l = a(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");
    public static final dl61 m = a(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.");
    public static final dl61 n = a(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.");
    public static final dl61 o = a(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.");
    public static final dl61 p = a(3, "Ad request failed with no connection error", "Ad request failed with network error. Please try again later.");
    public static final dl61 q = a(3, "Ad request failed with timeout error", "Ad request failed with network error. Please try again later.");
    public static final dl61 r = a(3, "Ad request failed with auth failure", "Ad request failed with network error. Please try again later.");
    public static final dl61 s = a(3, "Ad request failed with client error", "Ad request failed with network error. Please try again later.");
    public static final dl61 t = a(3, "Ad request failed with parse error", "Failed to parse server response. Please try again later.");
    public static final dl61 u = a(1, "Ad request failed with content preloading error", "Ad request failed with content preloading error. Please try again later");

    public static dl61 a(int i2, String str, String str2) {
        return new dl61(i2, str, str2, null);
    }
}
