package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Hr;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class UserProfile {
    private final List a;

    private UserProfile(LinkedList linkedList) {
        this.a = CollectionUtils.unmodifiableListCopy(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends Hr>> getUserProfileUpdates() {
        return this.a;
    }

    public static class Builder {
        private final LinkedList a;

        private Builder() {
            this.a = new LinkedList();
        }

        public Builder apply(UserProfileUpdate<? extends Hr> userProfileUpdate) {
            this.a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.a, 0);
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }
}
