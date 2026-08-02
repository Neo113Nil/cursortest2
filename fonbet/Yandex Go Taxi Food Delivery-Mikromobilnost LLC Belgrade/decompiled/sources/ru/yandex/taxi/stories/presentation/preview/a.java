package ru.yandex.taxi.stories.presentation.preview;

import android.view.View;
import android.view.ViewStub;
import androidx.core.view.b;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.kdh0;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.tje;
import defpackage.vng;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.stories.presentation.preview.a;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class a {
    public final ViewStub a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public pzt0 e;
    public pzt0 f;

    public a(StoryPreviewView storyPreviewView) {
        int i = kdh0.story_preview_text_stub;
        WeakHashMap weakHashMap = b.a;
        this.a = (ViewStub) ((View) rp31.d(storyPreviewView, i));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i2 = 0;
        this.b = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: wpu0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                a aVar = this.b;
                switch (i3) {
                    case 0:
                        return aVar.a.inflate();
                    case 1:
                        View view = (View) aVar.b.getValue();
                        int i4 = kdh0.story_preview_text_title;
                        WeakHashMap weakHashMap2 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view, i4));
                    default:
                        View view2 = (View) aVar.b.getValue();
                        int i5 = kdh0.story_preview_text_subtitle;
                        WeakHashMap weakHashMap3 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view2, i5));
                }
            }
        });
        final int i3 = 1;
        this.c = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: wpu0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i3;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return aVar.a.inflate();
                    case 1:
                        View view = (View) aVar.b.getValue();
                        int i4 = kdh0.story_preview_text_title;
                        WeakHashMap weakHashMap2 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view, i4));
                    default:
                        View view2 = (View) aVar.b.getValue();
                        int i5 = kdh0.story_preview_text_subtitle;
                        WeakHashMap weakHashMap3 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view2, i5));
                }
            }
        });
        final int i4 = 2;
        this.d = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: wpu0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i32 = i4;
                a aVar = this.b;
                switch (i32) {
                    case 0:
                        return aVar.a.inflate();
                    case 1:
                        View view = (View) aVar.b.getValue();
                        int i42 = kdh0.story_preview_text_title;
                        WeakHashMap weakHashMap2 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view, i42));
                    default:
                        View view2 = (View) aVar.b.getValue();
                        int i5 = kdh0.story_preview_text_subtitle;
                        WeakHashMap weakHashMap3 = b.a;
                        return (RobotoTextView) ((View) rp31.d(view2, i5));
                }
            }
        });
    }

    public static pzt0 a(RobotoTextView robotoTextView, FormattedText formattedText, c cVar) {
        pey o;
        robotoTextView.setText(c.f(cVar, formattedText, true, null, 8));
        if (formattedText.e() || (o = vng.o(robotoTextView)) == null) {
            return null;
        }
        return tje.N(eja1.s(o), null, null, new StoryPreviewView$PreviewTextHolder$updateTextView$1(robotoTextView, cVar, formattedText, null), 3);
    }
}
