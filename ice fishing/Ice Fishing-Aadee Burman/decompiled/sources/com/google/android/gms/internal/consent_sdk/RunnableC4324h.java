package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebSettings;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.consent_sdk.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4324h implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35679n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f35680u;

    public /* synthetic */ RunnableC4324h(int i, Object obj) {
        this.f35679n = i;
        this.f35680u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f35680u;
        switch (this.f35679n) {
            case 0:
                ((C4336k) obj).c(new C4341l0(4, "Web view timed out."));
                break;
            case 1:
                C4387x c4387x = (C4387x) obj;
                String str = (String) c4387x.f35782a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    break;
                } else {
                    AtomicReference atomicReference = c4387x.f35791k;
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i = 0; i < size; i++) {
                        P0 p02 = (P0) ((Queue) atomicReference.get()).poll();
                        if (p02 != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(c4387x.f35783b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                int c9 = p02.c();
                                Logger logger = C4331i2.f35686g;
                                if (c9 > 4096) {
                                    c9 = 4096;
                                }
                                C4331i2 c4331i2 = new C4331i2(outputStream, c9);
                                p02.a(c4331i2);
                                if (c4331i2.f35691e > 0) {
                                    c4331i2.k();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(p02);
                                }
                            } catch (IOException e9) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e9.getMessage())));
                                ((Queue) atomicReference.get()).add(p02);
                            } catch (URISyntaxException e10) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e10.getMessage());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                ((M3.d) obj).onConsentInfoUpdateSuccess();
                break;
        }
    }
}
