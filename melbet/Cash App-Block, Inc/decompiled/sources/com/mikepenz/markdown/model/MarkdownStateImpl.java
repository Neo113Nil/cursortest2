package com.mikepenz.markdown.model;

import com.mikepenz.markdown.model.State;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import net.idrnd.face.iad.capture.internal.s2;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.parser.MarkdownParser;

/* loaded from: classes4.dex */
public final class MarkdownStateImpl {
    public Input input;
    public final StateFlowImpl linkStateFlow;
    public final ReadonlyStateFlow state;
    public final StateFlowImpl stateFlow;

    public MarkdownStateImpl(Input input) {
        input.getClass();
        this.input = input;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new State.Loading(input.referenceLinkHandler));
        this.stateFlow = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.linkStateFlow = FlowKt.MutableStateFlow(emptyMap);
    }

    public final State parseBlocking$multiplatform_markdown_renderer() {
        State error;
        try {
            Input input = this.input;
            MarkdownParser markdownParser = input.parser;
            String str = input.content;
            markdownParser.getClass();
            str.getClass();
            MarkdownElementType markdownElementType = MarkdownTokenTypes.MARKDOWN_FILE;
            markdownElementType.getClass();
            try {
                ASTNodeImpl doParse = markdownParser.doParse(markdownElementType, str);
                this.input.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                s2.lookupLinkDefinition$default(linkedHashMap, doParse, this.input.content, true, 16);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    this.input.referenceLinkHandler.store((String) entry.getKey(), (String) entry.getValue());
                }
                StateFlowImpl stateFlowImpl = this.linkStateFlow;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, linkedHashMap);
                Input input2 = this.input;
                error = new State.Success(doParse, input2.content, input2.referenceLinkHandler);
            } catch (MarkdownParsingException e) {
                throw e;
            }
        } catch (Throwable th) {
            error = new State.Error(th, this.input.referenceLinkHandler);
        }
        StateFlowImpl stateFlowImpl2 = this.stateFlow;
        stateFlowImpl2.getClass();
        stateFlowImpl2.updateState(null, error);
        return error;
    }
}
