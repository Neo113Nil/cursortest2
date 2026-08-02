package ru.yandex.common.network;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aez;
import defpackage.ny61;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import ru.yandex.common.location.LocationProvider;

/* loaded from: classes4.dex */
public abstract class Request implements Parcelable {
    public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: ru.yandex.common.network.Request.1
        private <T extends Request> T newRequest(Class cls, Parcel parcel) {
            try {
                T t = (T) cls.newInstance();
                t.readFromParcel(parcel);
                return t;
            } catch (ClassCastException e) {
                aez.a(Request.TAG, "ClassCastException while creating " + cls.getCanonicalName(), e);
                return null;
            } catch (IllegalAccessException e2) {
                aez.a(Request.TAG, "IllegalAccessException while creating " + cls.getCanonicalName(), e2);
                return null;
            } catch (InstantiationException e3) {
                aez.a(Request.TAG, "InstantiationException while creating " + cls.getCanonicalName(), e3);
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public Request createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            try {
                return newRequest(Class.forName(readString), parcel);
            } catch (ClassNotFoundException e) {
                aez.a(Request.TAG, "Unknown 'class=" + readString + "' for request creation.", e);
                return null;
            }
        }

        @Override // android.os.Parcelable.Creator
        public Request[] newArray(int i) {
            return new Request[i];
        }
    };
    public static final String PARAM_GZIP = "gzip";
    public static final String PARAM_UUID = "uuid";
    public static final String TAG = "[Ya:Request]";
    protected String baseUrl;
    protected HashMap<String, String> headers;
    protected LocationProvider locationProvider;
    protected HashMap<String, String> values;

    public Request() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.values = hashMap;
        hashMap.put(PARAM_GZIP, "");
    }

    public static final String register(Class cls) {
        return cls.getCanonicalName();
    }

    public void addHeader(String str, String str2) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(str, str2);
    }

    public abstract String describeRequest();

    public abstract String getBaseUrl();

    public HttpEntity getEntity() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : this.values.entrySet()) {
            arrayList.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        try {
            return new UrlEncodedFormEntity(arrayList, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            ny61.f(e);
            return null;
        }
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public abstract String getMethod();

    public abstract String getUrl();

    public String getUuid() {
        return this.values.get("uuid");
    }

    public HashMap<String, String> getValues() {
        return this.values;
    }

    public boolean isUuidNecessary() {
        return true;
    }

    public void readFromParcel(Parcel parcel) {
        parcel.readMap(this.values, Request.class.getClassLoader());
        parcel.readMap(this.headers, Request.class.getClassLoader());
        this.baseUrl = parcel.readString();
        this.locationProvider = (LocationProvider) parcel.readParcelable(Request.class.getClassLoader());
    }

    public void setUuid(String str) {
        if (str != null) {
            this.values.put("uuid", str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(describeRequest());
        parcel.writeMap(this.values);
        parcel.writeMap(this.headers);
        parcel.writeString(this.baseUrl);
        parcel.writeParcelable(this.locationProvider, 0);
    }
}
