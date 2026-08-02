package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0555n5;
import io.appmetrica.analytics.impl.C0559n9;
import io.appmetrica.analytics.impl.C0588o9;
import io.appmetrica.analytics.impl.C0672r7;
import io.appmetrica.analytics.impl.C0744tl;
import io.appmetrica.analytics.impl.C0776uo;
import io.appmetrica.analytics.impl.C0778uq;
import io.appmetrica.analytics.impl.Hr;
import io.appmetrica.analytics.impl.To;

/* loaded from: classes4.dex */
public class GenderAttribute {
    private final C0672r7 a = new C0672r7("appmetrica_gender", new C0588o9(), new To());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");

        private final String a;

        Gender(String str) {
            this.a = str;
        }

        public String getStringValue() {
            return this.a;
        }
    }

    public UserProfileUpdate<? extends Hr> withValue(Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C0559n9 c0559n9 = new C0559n9();
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new C0778uq(str, stringValue, c0559n9, c0672r7.a, new C0555n5(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueIfUndefined(Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C0559n9 c0559n9 = new C0559n9();
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new C0778uq(str, stringValue, c0559n9, c0672r7.a, new C0776uo(c0672r7.b)));
    }

    public UserProfileUpdate<? extends Hr> withValueReset() {
        C0672r7 c0672r7 = this.a;
        return new UserProfileUpdate<>(new C0744tl(0, c0672r7.c, c0672r7.a, c0672r7.b));
    }
}
