package com.adjust.sdk;

import org.json.JSONObject;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class AdjustSessionFailure {
    public String adid;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        return Util.formatString("Session Failure msg:%s time:%s adid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}
