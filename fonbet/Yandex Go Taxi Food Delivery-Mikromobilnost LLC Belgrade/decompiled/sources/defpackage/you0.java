package defpackage;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class you0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryModalView b;

    public /* synthetic */ you0(StoryModalView storyModalView, int i) {
        this.a = i;
        this.b = storyModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        StoryModalView storyModalView = this.b;
        switch (i) {
            case 0:
                StoryModalView.animateToVideo$lambda$0(storyModalView);
                break;
            case 1:
                StoryModalView._init_$lambda$5(storyModalView);
                break;
            case 2:
                storyModalView.resumeLottieAnimationFromBeginning();
                break;
            case 3:
                StoryModalView.scheduleLoadingIndicatorUpdate$lambda$0(storyModalView);
                break;
            case 4:
                StoryModalView.cancelDismiss$lambda$0(storyModalView);
                break;
            case 5:
                StoryModalView.animateToNext$lambda$0(storyModalView);
                break;
            case 6:
                storyModalView.scrollAnimationCanceled();
                break;
            case 7:
                StoryModalView.settleStoryScroll$lambda$1(storyModalView);
                break;
            case 8:
                StoryModalView.settleStoryScroll$lambda$2(storyModalView);
                break;
            case 9:
                storyModalView.scrollAnimationCanceled();
                break;
            case 10:
                storyModalView.finishedScrollToNextPage();
                break;
            case 11:
                storyModalView.finishedScrollToPreviousPage();
                break;
            case 12:
                storyModalView.onPlayerPositionChanged();
                break;
            case 13:
                StoryModalView.animateToPrevious$lambda$0(storyModalView);
                break;
            case 14:
                storyModalView.updateViewsVisibility();
                break;
            default:
                StoryModalView._init_$lambda$4(storyModalView);
                break;
        }
    }
}
