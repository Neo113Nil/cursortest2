package com.android.volley.toolbox;

import androidx.viewpager.widget.ViewPager;
import com.android.volley.toolbox.HurlStack;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class HttpResponse {
    public static final ViewPager.AnonymousClass1 BUF_COMPARATOR = new ViewPager.AnonymousClass1(20);
    public final Object mContent;
    public final int mContentLength;
    public final ArrayList mHeaders;
    public int mStatusCode;

    public HttpResponse() {
        this.mHeaders = new ArrayList();
        this.mContent = new ArrayList(64);
        this.mStatusCode = 0;
        this.mContentLength = 4096;
    }

    public synchronized byte[] getBuf(int i) {
        for (int i2 = 0; i2 < ((ArrayList) this.mContent).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.mContent).get(i2);
            if (bArr.length >= i) {
                this.mStatusCode -= bArr.length;
                ((ArrayList) this.mContent).remove(i2);
                this.mHeaders.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void returnBuf(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.mContentLength) {
                this.mHeaders.add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.mContent, bArr, BUF_COMPARATOR);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.mContent).add(binarySearch, bArr);
                this.mStatusCode += bArr.length;
                synchronized (this) {
                    while (this.mStatusCode > this.mContentLength) {
                        byte[] bArr2 = (byte[]) this.mHeaders.remove(0);
                        ((ArrayList) this.mContent).remove(bArr2);
                        this.mStatusCode -= bArr2.length;
                    }
                }
            }
        }
    }

    public HttpResponse(int i, ArrayList arrayList, int i2, HurlStack.UrlConnectionInputStream urlConnectionInputStream) {
        this.mStatusCode = i;
        this.mHeaders = arrayList;
        this.mContentLength = i2;
        this.mContent = urlConnectionInputStream;
    }
}
