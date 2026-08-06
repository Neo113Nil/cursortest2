package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Bi;
import io.appmetrica.analytics.impl.C0272a8;
import io.appmetrica.analytics.impl.C0733s4;
import io.appmetrica.analytics.impl.C0761t6;
import io.appmetrica.analytics.impl.C0906yl;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import io.appmetrica.analytics.impl.Xk;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Z7;

/* loaded from: classes.dex */
public class GenderAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0761t6 f7554a = new C0761t6("appmetrica_gender", new C0272a8(), new C0906yl());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");


        /* renamed from: a, reason: collision with root package name */
        private final String f7556a;

        Gender(String str) {
            this.f7556a = str;
        }

        public String getStringValue() {
            return this.f7556a;
        }
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValue(Gender gender) {
        String str = this.f7554a.f6936c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0761t6 c0761t6 = this.f7554a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0761t6.f6934a, new C0733s4(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueIfUndefined(Gender gender) {
        String str = this.f7554a.f6936c;
        String stringValue = gender.getStringValue();
        Z7 z7 = new Z7();
        C0761t6 c0761t6 = this.f7554a;
        return new UserProfileUpdate<>(new Ym(str, stringValue, z7, c0761t6.f6934a, new Xk(c0761t6.f6935b)));
    }

    public UserProfileUpdate<? extends InterfaceC0391eo> withValueReset() {
        C0761t6 c0761t6 = this.f7554a;
        return new UserProfileUpdate<>(new Bi(0, c0761t6.f6936c, c0761t6.f6934a, c0761t6.f6935b));
    }
}
