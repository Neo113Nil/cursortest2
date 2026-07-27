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
public final /* synthetic */ class RunnableC4337h implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35842n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f35843u;

    public /* synthetic */ RunnableC4337h(int i, Object obj) {
        this.f35842n = i;
        this.f35843u = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f35843u;
        switch (this.f35842n) {
            case 0:
                ((C4349k) obj).c(new C4354l0(4, "Web view timed out."));
                break;
            case 1:
                C4400x c4400x = (C4400x) obj;
                String str = (String) c4400x.f35945a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    break;
                } else {
                    AtomicReference atomicReference = c4400x.f35954k;
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i = 0; i < size; i++) {
                        P0 p02 = (P0) ((Queue) atomicReference.get()).poll();
                        if (p02 != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(c4400x.f35946b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                int c4 = p02.c();
                                Logger logger = C4344i2.f35849g;
                                if (c4 > 4096) {
                                    c4 = 4096;
                                }
                                C4344i2 c4344i2 = new C4344i2(outputStream, c4);
                                p02.a(c4344i2);
                                if (c4344i2.f35854e > 0) {
                                    c4344i2.k();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(p02);
                                }
                            } catch (IOException e6) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e6.getMessage())));
                                ((Queue) atomicReference.get()).add(p02);
                            } catch (URISyntaxException e9) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e9.getMessage());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                ((I3.d) obj).onConsentInfoUpdateSuccess();
                break;
        }
    }
}
