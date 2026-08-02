package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.C0185cq;
import io.appmetrica.analytics.impl.C0312h9;
import io.appmetrica.analytics.impl.C0341i9;
import io.appmetrica.analytics.impl.C0365j5;
import io.appmetrica.analytics.impl.C0381jl;
import io.appmetrica.analytics.impl.C0454m7;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.impl.Zn;

/* loaded from: classes5.dex */
public class GenderAttribute {
    private final C0454m7 a = new C0454m7("appmetrica_gender", new C0341i9(), new Bo());

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

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValue(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C0312h9 c0312h9 = new C0312h9();
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new C0185cq(str, stringValue, c0312h9, c0454m7.a, new C0365j5(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueIfUndefined(@NonNull Gender gender) {
        String str = this.a.c;
        String stringValue = gender.getStringValue();
        C0312h9 c0312h9 = new C0312h9();
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new C0185cq(str, stringValue, c0312h9, c0454m7.a, new Zn(c0454m7.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0532or> withValueReset() {
        C0454m7 c0454m7 = this.a;
        return new UserProfileUpdate<>(new C0381jl(0, c0454m7.c, c0454m7.a, c0454m7.b));
    }
}
