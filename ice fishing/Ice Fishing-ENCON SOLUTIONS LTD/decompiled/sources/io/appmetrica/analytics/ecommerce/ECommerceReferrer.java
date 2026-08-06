package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public class ECommerceReferrer {

    /* renamed from: a, reason: collision with root package name */
    private String f3916a;

    /* renamed from: b, reason: collision with root package name */
    private String f3917b;

    /* renamed from: c, reason: collision with root package name */
    private ECommerceScreen f3918c;

    public String getIdentifier() {
        return this.f3917b;
    }

    public ECommerceScreen getScreen() {
        return this.f3918c;
    }

    public String getType() {
        return this.f3916a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f3917b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f3918c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f3916a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f3916a + "', identifier='" + this.f3917b + "', screen=" + this.f3918c + '}';
    }
}
