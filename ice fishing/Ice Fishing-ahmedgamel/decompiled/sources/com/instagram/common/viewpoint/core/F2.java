package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public final class F2 extends FrameLayout implements InterfaceC1732ee {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final MediaView A04;
    public final NativeAd A05;
    public final C1733ef A06;
    public final ArrayList<View> A07;
    public static String[] A08 = {"1TbW2eCQhsvMTBw6WLgOl0T9uhpIUPzf", "ziTp6gBPmnDALVepebGOFatIHSWtUxBS", "U8KhSuPVLRzWbOpxbAxolTOugcqmOnaD", "0bQh9HQE8V8VC7fBvS6H2cn6s67Amjp4", "9aGEAiUrkMnbIgwzZX43En2EpYymCUz", "e9g0133auHqHsGsSwLriU2UE0E7n3ej0", "gJVbKnLfSb6S0wmfJEV2eyQXUghITZN0", ""};
    public static final int A0E = (int) (XX.A02 * 6.0f);
    public static final int A0D = (int) (XX.A02 * 8.0f);
    public static final int A0C = (int) (XX.A02 * 12.0f);
    public static final int A0A = (int) (XX.A02 * 350.0f);
    public static final int A09 = (int) (XX.A02 * 250.0f);
    public static final int A0B = (int) (XX.A02 * 175.0f);

    public F2(C1860gi c1860gi, NativeAd nativeAd, C1324Vd c1324Vd, EnumC1325Ve enumC1325Ve, C1554bk c1554bk, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1860gi);
        this.A07 = new ArrayList<>();
        this.A05 = nativeAd;
        this.A04 = mediaView;
        this.A06 = new C1733ef(c1860gi, this.A05, c1324Vd, c1554bk, adOptionsView);
        this.A06.setPadding(A0C, A0C, A0C, A0E);
        addView(this.A06, new FrameLayout.LayoutParams(-1, -2));
        if (enumC1325Ve == EnumC1325Ve.A09 || enumC1325Ve == EnumC1325Ve.A0B) {
            A07(c1324Vd);
        }
        addView(this.A04, new FrameLayout.LayoutParams(-1, -2));
        if (enumC1325Ve != EnumC1325Ve.A0B || this.A05.getAdCreativeType() != NativeAd.AdCreativeType.CAROUSEL) {
            A06(c1324Vd);
            A04(c1324Vd);
            A05(c1324Vd);
        }
        this.A07.add(c1554bk);
        this.A07.add(mediaView);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00() {
        int i;
        int i4;
        int linkDescHeight;
        int subtitleHeight = 0;
        if (this.A03 != null && this.A03.getVisibility() == 0) {
            i = this.A03.getMeasuredHeight();
        } else {
            i = 0;
        }
        if (this.A02 != null) {
            int linkDescHeight2 = this.A02.getVisibility();
            if (linkDescHeight2 == 0) {
                i4 = this.A02.getMeasuredHeight();
                if (this.A00 != null) {
                    int linkDescHeight3 = this.A00.getVisibility();
                    if (linkDescHeight3 == 0) {
                        TextView textView = this.A00;
                        if (A08[0].charAt(24) != 'u') {
                            throw new RuntimeException();
                        }
                        A08[0] = "HiZrVlulAuiH54vlSWYSbySNuASlYz5G";
                        linkDescHeight = textView.getMeasuredHeight();
                        if (this.A01 != null && this.A01.getVisibility() == 0) {
                            subtitleHeight = this.A01.getMeasuredHeight() + A0C + A0D;
                        }
                        int titleHeight = getMeasuredHeight();
                        int ctaHeight = this.A06.getMeasuredHeight();
                        return ((((titleHeight - ctaHeight) - i) - i4) - linkDescHeight) - subtitleHeight;
                    }
                }
                linkDescHeight = 0;
                if (this.A01 != null) {
                    subtitleHeight = this.A01.getMeasuredHeight() + A0C + A0D;
                }
                int titleHeight2 = getMeasuredHeight();
                int ctaHeight2 = this.A06.getMeasuredHeight();
                return ((((titleHeight2 - ctaHeight2) - i) - i4) - linkDescHeight) - subtitleHeight;
            }
        }
        i4 = 0;
        if (this.A00 != null) {
        }
        linkDescHeight = 0;
        if (this.A01 != null) {
        }
        int titleHeight22 = getMeasuredHeight();
        int ctaHeight22 = this.A06.getMeasuredHeight();
        return ((((titleHeight22 - ctaHeight22) - i) - i4) - linkDescHeight) - subtitleHeight;
    }

    private void A01() {
        if (this.A03 != null) {
            this.A03.setLines(1);
        }
        if (this.A02 != null) {
            this.A02.setLines(1);
        }
        if (this.A00 != null) {
            this.A00.setLines(1);
        }
    }

    private void A02(int i) {
        YB.A0O(this.A04, i > A0B ? 0 : 8);
        YB.A0O(this.A03, i > A0A ? 0 : 8);
        YB.A0O(this.A00, i <= A09 ? 8 : 0);
    }

    public static void A03(int i, int i4, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null && textView.getVisibility() == 0) {
                int A04 = YB.A04(textView, i4);
                textView.setLines(A04 + 1);
                textView.measure(i, View.MeasureSpec.makeMeasureSpec(textView.getMeasuredHeight() + (textView.getLineHeight() * A04), 1073741824));
                i4 -= textView.getLineHeight() * A04;
            }
        }
    }

    private void A04(C1324Vd c1324Vd) {
        if (this.A05.getAdBodyText() != null && !this.A05.getAdBodyText().trim().isEmpty()) {
            this.A00 = new TextView(getContext());
            c1324Vd.A06(this.A00);
            this.A00.setText(this.A05.getAdBodyText());
            this.A00.setPadding(A0C, 0, A0C, 0);
            addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A05(C1324Vd c1324Vd) {
        if (this.A05.hasCallToAction()) {
            this.A01 = new TextView(getContext());
            YB.A0K(this.A01);
            c1324Vd.A05(this.A01);
            this.A01.setText(this.A05.getAdCallToAction());
            this.A01.setPadding(A0D, A0D, A0D, A0D);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(A0D, 0, A0D, 0);
            addView(this.A01, layoutParams);
            this.A07.add(this.A01);
        }
    }

    private void A06(C1324Vd c1324Vd) {
        if (this.A05.getAdHeadline() != null && !this.A05.getAdHeadline().trim().isEmpty()) {
            this.A02 = new TextView(getContext());
            c1324Vd.A07(this.A02);
            this.A02.setText(this.A05.getAdHeadline());
            this.A02.setPadding(A0C, A0D, A0C, 0);
            addView(this.A02, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    private void A07(C1324Vd c1324Vd) {
        if (this.A05.getAdLinkDescription() != null && !this.A05.getAdLinkDescription().trim().isEmpty()) {
            this.A03 = new TextView(getContext());
            c1324Vd.A06(this.A03);
            this.A03.setText(this.A05.getAdLinkDescription());
            this.A03.setPadding(A0C, 0, A0C, A0D);
            addView(this.A03, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1732ee
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1732ee
    public ArrayList<View> getViewsForInteraction() {
        return this.A07;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        C1733ef c1733ef = this.A06;
        int top = this.A06.getMeasuredHeight();
        c1733ef.layout(i, i4, i6, top + i4);
        int top2 = this.A06.getMeasuredHeight();
        int i10 = i4 + top2;
        if (this.A03 != null) {
            int visibility = this.A03.getVisibility();
            if (A08[4].length() == 2) {
                throw new RuntimeException();
            }
            A08[4] = "Mpk43iWHaBi74JKA9YKWwwxfR5sOjUPQ";
            if (visibility == 0) {
                int measuredHeight = this.A03.getMeasuredHeight();
                int top3 = i10 + measuredHeight;
                this.A03.layout(i, i10, i6, top3);
                i10 += measuredHeight;
            }
        }
        MediaView mediaView = this.A04;
        int top4 = this.A04.getMeasuredHeight();
        mediaView.layout(i, i10, i6, top4 + i10);
        int top5 = this.A04.getMeasuredHeight();
        int i11 = i10 + top5;
        if (this.A02 != null) {
            TextView textView = this.A02;
            int top6 = this.A02.getMeasuredHeight();
            textView.layout(i, i11, i6, top6 + i11);
            int top7 = this.A02.getMeasuredHeight();
            i11 += top7;
        }
        if (this.A00 != null) {
            int top8 = this.A00.getVisibility();
            if (top8 == 0) {
                TextView textView2 = this.A00;
                int top9 = this.A00.getMeasuredHeight();
                textView2.layout(i, i11, i6, top9 + i11);
            }
        }
        if (this.A01 != null) {
            TextView textView3 = this.A01;
            int i12 = A0C + i;
            int top10 = this.A01.getMeasuredHeight();
            int i13 = i9 - top10;
            int top11 = A0C;
            int i14 = i13 - top11;
            int top12 = A0C;
            int i15 = i6 - top12;
            int top13 = A0C;
            textView3.layout(i12, i14, i15, i9 - top13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i4) {
        int i6;
        int mediaViewHeight;
        A02(View.MeasureSpec.getSize(i4));
        A01();
        super.onMeasure(i, i4);
        int A00 = A00();
        int emptySpace = this.A04.getMediaWidth();
        if (emptySpace != 0) {
            int emptySpace2 = this.A04.getMediaHeight();
            if (emptySpace2 != 0) {
                if (((C1890hC) this.A04.getMediaViewApi()).A0b()) {
                    i6 = A00;
                } else {
                    int emptySpace3 = this.A04.getMediaHeight();
                    float f2 = emptySpace3;
                    int emptySpace4 = this.A04.getMediaWidth();
                    float aspectRatio = f2 / emptySpace4;
                    int emptySpace5 = this.A04.getMeasuredWidth();
                    i6 = Math.min((int) (emptySpace5 * aspectRatio), A00);
                }
                MediaView mediaView = this.A04;
                mediaViewHeight = A08[4].length();
                if (mediaViewHeight != 2) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "bBjhlDCZcebcBoQzUAOgAVf3zFQrapwM";
                strArr[2] = "urvh83LMTjJVKtjaQ5bPrRJiE37dq76T";
                int emptySpace6 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                mediaView.measure(i, emptySpace6);
                if (i6 < A00) {
                    A03(i, A00 - i6, this.A02, this.A00, this.A03);
                    return;
                }
                return;
            }
        }
        i6 = A00;
        MediaView mediaView2 = this.A04;
        mediaViewHeight = A08[4].length();
        if (mediaViewHeight != 2) {
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1732ee
    public final void unregisterView() {
        this.A05.unregisterView();
    }
}
