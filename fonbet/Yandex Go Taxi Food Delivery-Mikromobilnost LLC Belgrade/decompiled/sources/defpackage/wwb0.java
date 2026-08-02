package defpackage;

import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenResponse;

/* loaded from: classes3.dex */
public abstract class wwb0 {
    public static final uwb0 a(IssuePinTokenResponse issuePinTokenResponse) {
        String value;
        int i = vwb0.a[issuePinTokenResponse.getAction().ordinal()];
        if (i == 1) {
            IssuePinTokenResponse.PinTokenResponse pinToken = issuePinTokenResponse.getPinToken();
            if (pinToken != null && (value = pinToken.getValue()) != null) {
                return new swb0(new PinTokenEntity(value, issuePinTokenResponse.getPinToken().getId()));
            }
            ny61.r("Pin token is missing");
            return null;
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        String authorizationTrackId = issuePinTokenResponse.getAuthorizationTrackId();
        if (authorizationTrackId != null) {
            return new twb0(authorizationTrackId);
        }
        ny61.r("Auth track id is missing");
        return null;
    }
}
