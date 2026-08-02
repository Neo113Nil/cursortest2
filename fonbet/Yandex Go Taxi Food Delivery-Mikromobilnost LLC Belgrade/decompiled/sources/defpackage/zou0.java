package defpackage;

import android.graphics.drawable.Drawable;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class zou0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoryModalView b;

    public /* synthetic */ zou0(StoryModalView storyModalView, int i) {
        this.a = i;
        this.b = storyModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 mainMediaInfo$lambda$0;
        zy11 playImage$lambda$0;
        int i = this.a;
        StoryModalView storyModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = StoryModalView.insetsType$lambda$0(storyModalView, (t1w) obj);
                return insetsType$lambda$0;
            case 1:
                mainMediaInfo$lambda$0 = StoryModalView.setMainMediaInfo$lambda$0(storyModalView, (Drawable) obj);
                return mainMediaInfo$lambda$0;
            default:
                playImage$lambda$0 = StoryModalView.playImage$lambda$0(storyModalView, (Drawable) obj);
                return playImage$lambda$0;
        }
    }
}
