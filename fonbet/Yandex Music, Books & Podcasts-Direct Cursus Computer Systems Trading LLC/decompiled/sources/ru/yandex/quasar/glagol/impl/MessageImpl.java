package ru.yandex.quasar.glagol.impl;

import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.su4;
import defpackage.tlm;
import defpackage.u3o;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.quasar.glagol.ResponseMessage$Status;
import ru.yandex.quasar.glagol.State;

/* loaded from: classes6.dex */
class MessageImpl implements u3o {
    private long clientReceivedTime;
    private long clientRequestTime;

    @SerializedName("errorCode")
    private final String errorCode;

    @SerializedName("errorText")
    private final String errorText;

    @SerializedName("errorTextLang")
    private final String errorTextLang;

    @SerializedName("extra")
    private final Map<String, String> extra;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("sentTime")
    private final long sentTime;

    @SerializedName("state")
    private final State state;

    @SerializedName("status")
    private final ResponseMessage$Status status;

    @SerializedName("supported_features")
    private final List<String> supportedFeatures;

    @SerializedName("vinsResponse")
    private final JSONObject vinsResponse;

    public MessageImpl(String str, long j, State state, ResponseMessage$Status responseMessage$Status, String str2, @NonNull Map<String, String> map, List<String> list, JsonObject jsonObject, String str3, String str4, String str5) {
        JSONObject jSONObject;
        this.id = str;
        this.requestId = str2;
        this.sentTime = j;
        this.state = state;
        this.status = responseMessage$Status;
        this.extra = map;
        this.supportedFeatures = list;
        if (jsonObject == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(jsonObject.toString());
            } catch (JSONException e) {
                b6e.q(e);
                throw null;
            }
        }
        this.vinsResponse = jSONObject;
        this.errorCode = str3;
        this.errorText = str4;
        this.errorTextLang = str5;
    }

    public long getClientReceivedResponseTime() {
        return this.clientReceivedTime;
    }

    public long getClientRequestTime() {
        return this.clientRequestTime;
    }

    @Override // defpackage.u3o
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override // defpackage.u3o
    public String getErrorText() {
        return this.errorText;
    }

    public String getErrorTextLang() {
        return this.errorTextLang;
    }

    @Override // defpackage.dzh
    @NonNull
    public Map<String, String> getExtra() {
        return this.extra;
    }

    public String getId() {
        return this.id;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public long getSentTime() {
        return this.sentTime;
    }

    @Override // defpackage.dzh
    public State getState() {
        return this.state;
    }

    @Override // defpackage.u3o
    public ResponseMessage$Status getStatus() {
        return this.status;
    }

    public List<String> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public JSONObject getVinsResponse() {
        return this.vinsResponse;
    }

    public void setClientReceivedTime(long j) {
        this.clientReceivedTime = j;
    }

    public void setClientRequestTime(long j) {
        this.clientRequestTime = j;
    }

    public String toString() {
        String str = "MsgImpl{id=" + this.id + ", sentTime=" + this.sentTime;
        if (this.status != null) {
            StringBuilder m = tlm.m(str, ", status=");
            m.append(this.status);
            m.append(", requestId='");
            str = su4.o(m, this.requestId, "'");
            if (this.status != ResponseMessage$Status.SUCCESS) {
                StringBuilder m2 = tlm.m(str, ", errorCode=");
                m2.append(this.errorCode);
                m2.append(", errorText='");
                str = dfi.i(m2, this.errorText, '\'');
            }
        }
        StringBuilder m3 = tlm.m(str, ", state=");
        m3.append(this.state);
        m3.append('}');
        return m3.toString();
    }
}
