package defpackage;

import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView;

/* loaded from: classes6.dex */
public final /* synthetic */ class upu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryPreviewView b;

    public /* synthetic */ upu0(StoryPreviewView storyPreviewView, int i) {
        this.a = i;
        this.b = storyPreviewView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        StoryPreviewView storyPreviewView = this.b;
        switch (i) {
            case 0:
                StoryPreviewView.finishClickAnimation$lambda$0(storyPreviewView);
                break;
            default:
                StoryPreviewView.onTouchEvent$lambda$0(storyPreviewView);
                break;
        }
    }
}
