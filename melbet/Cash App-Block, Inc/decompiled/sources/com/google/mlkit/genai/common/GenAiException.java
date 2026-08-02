package com.google.mlkit.genai.common;

import com.google.android.gms.internal.mlkit_genai_prompt.zzcm;

/* loaded from: classes4.dex */
public final class GenAiException extends Exception {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenAiException(zzcm zzcmVar, int i) {
        super("[ErrorCode " + i + "] " + r0, zzcmVar);
        String str;
        if (i == 4) {
            str = "Request doesn't pass certain policy check. Please try a different input.";
        } else if (i == 15) {
            str = "Couldn't generate a response due to policy check failure. Please try a different input.";
        } else if (i == 30) {
            str = "Background usage is blocked. Please use the API when your app is in the foreground instead.";
        } else if (i == 501) {
            str = "Not enough storage. Please clear some space.";
        } else if (i == 604) {
            str = "Android version is too low. Please update.";
        } else if (i == 7) {
            str = "The request is canceled.";
        } else if (i == 8) {
            str = "This feature is not available on this device. It is due to either the device not supporting it or the latest configuration file has not been downloaded.";
        } else if (i == 9) {
            str = "Request cannot be processed. Either your app is out of usage quota (try again later) or the request is from disallowed background usage (use the API while the app is in the foreground).";
        } else if (i == 11) {
            str = "Generated response doesn't pass certain policy check. Please try a different input.";
        } else if (i == 12) {
            str = "Request too large. Please shorten your input.";
        } else if (i == 27) {
            str = "A long-duration (for example per-day) quota for the calling app's uid has been exceeded. Use of AICore from this app has been restricted to preserve battery.";
        } else if (i != 28) {
            switch (i) {
                case -102:
                    str = "Invalid input image. It can be due to invalid image URL, failure to decode to bitmap, invalid mime type or other image processing failures.";
                    break;
                case -101:
                    str = "AICore is either not installed or the installed version is too low.";
                    break;
                case -100:
                    str = "Request too small. Please provide a longer input.";
                    break;
                default:
                    if (zzcmVar == null) {
                        str = "Unknown error.";
                        break;
                    } else {
                        str = zzcmVar.getMessage();
                        if (str == null) {
                            str = "";
                            break;
                        }
                    }
                    break;
            }
        } else {
            str = "A long-duration (for example per-day) quota for the device has been exceeded. Use of AICore (from any app) has been restricted to preserve battery.";
        }
        this.zza = i;
    }

    public GenAiException(int i, String str, Throwable th) {
        super(str, th);
        this.zza = i;
    }
}
