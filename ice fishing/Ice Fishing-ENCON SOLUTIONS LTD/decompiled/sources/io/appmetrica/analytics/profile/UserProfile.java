package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC0391eo;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class UserProfile {

    /* renamed from: a, reason: collision with root package name */
    private final List f7560a;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedList f7561a;

        public /* synthetic */ Builder(int i2) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC0391eo> userProfileUpdate) {
            this.f7561a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f7561a, 0);
        }

        private Builder() {
            this.f7561a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i2) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC0391eo>> getUserProfileUpdates() {
        return this.f7560a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f7560a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
