package com.fillr.featuretoggle.metric;

import com.fillr.featuretoggle.UnleashException;
import com.google.android.filament.Box;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.mlkit.vision.text.zza;
import io.noties.markwon.RenderPropsImpl;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import net.oneformapp.PopEncryptorV2_;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class UnleashMetricsSender {
    public final Object clientRegistrationURL;
    public final Object gson;
    public final PopEncryptorV2_ unleashConfig;

    class DateTimeSerializer implements JsonSerializer<Date> {
        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(Date date, Type type2, JsonSerializationContext jsonSerializationContext) {
            return new JsonPrimitive(Long.valueOf(date.getTime()));
        }
    }

    public UnleashMetricsSender(PopEncryptorV2_ popEncryptorV2_, int i) {
        switch (i) {
            case 1:
                UnleashMetricsSender unleashMetricsSender = new UnleashMetricsSender(popEncryptorV2_, 0);
                this.clientRegistrationURL = new RenderPropsImpl(2);
                Calendar.getInstance().getTime();
                this.unleashConfig = popEncryptorV2_;
                this.gson = unleashMetricsSender;
                break;
            default:
                this.unleashConfig = popEncryptorV2_;
                Box box = (Box) popEncryptorV2_.encryptionKey;
                box.getClass();
                this.clientRegistrationURL = (URL) box.mHalfExtent;
                this.gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateTimeSerializer()).create();
                break;
        }
    }

    public void post(URL url, zza zzaVar) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } catch (Throwable th) {
                th = th;
            }
            try {
                httpURLConnection.setConnectTimeout(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                httpURLConnection.setReadTimeout(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                PopEncryptorV2_.setRequestProperties(httpURLConnection, this.unleashConfig);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream());
                ((Gson) this.gson).toJson(zzaVar, outputStreamWriter);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                httpURLConnection.connect();
                httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
            } catch (IOException e) {
                e = e;
                throw new UnleashException("Could not post to Unleash API", e);
            } catch (IllegalStateException e2) {
                e = e2;
                throw new UnleashException(e.getMessage(), e);
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (IllegalStateException e4) {
            e = e4;
        }
    }
}
