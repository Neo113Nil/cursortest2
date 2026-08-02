package ru.yandex.taxi.stories.presentation.story;

import androidx.media3.common.PlaybackException;
import defpackage.ioo;
import defpackage.xby;
import defpackage.xxc0;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final class c implements xxc0 {
    public final /* synthetic */ StoryModalView a;

    public c(StoryModalView storyModalView) {
        this.a = storyModalView;
    }

    @Override // defpackage.xxc0
    public final void onPlaybackStateChanged(int i) {
        StoryModalView.MediaType mediaType;
        float playbackProgress;
        ioo iooVar;
        StoryModalView storyModalView = this.a;
        mediaType = storyModalView.currentMediaType;
        if (mediaType != StoryModalView.MediaType.VIDEO) {
            return;
        }
        StoryModalView.State state = storyModalView.state;
        StoryModalView.State state2 = StoryModalView.State.BUFFERING;
        if (state == state2 || storyModalView.state == StoryModalView.State.PLAYING) {
            if (i == 2) {
                storyModalView.setState(state2);
            }
            if (i == 3) {
                storyModalView.setState(StoryModalView.State.PLAYING);
            }
        }
        if (i == 4) {
            g gVar = storyModalView.presenter;
            playbackProgress = storyModalView.getPlaybackProgress();
            iooVar = storyModalView.playerProxy;
            gVar.s(playbackProgress, iooVar.a(), storyModalView.transitions.r());
        }
    }

    @Override // defpackage.xxc0
    public final void onPlayerError(PlaybackException playbackException) {
        StoryModalView.MediaType mediaType;
        StoryModalView storyModalView = this.a;
        mediaType = storyModalView.currentMediaType;
        if (mediaType != StoryModalView.MediaType.VIDEO) {
            return;
        }
        storyModalView.onPlaybackError();
        xby.d.k(playbackException, "onPlayerError");
    }

    @Override // defpackage.xxc0
    public final void onRenderedFirstFrame() {
        StoryModalView.MediaType mediaType;
        StoryModalView storyModalView = this.a;
        mediaType = storyModalView.currentMediaType;
        if (mediaType != StoryModalView.MediaType.VIDEO) {
            return;
        }
        storyModalView.firstFrameRendered = true;
        if (storyModalView.state == StoryModalView.State.BUFFERING) {
            storyModalView.resumePlayback();
        }
    }
}
